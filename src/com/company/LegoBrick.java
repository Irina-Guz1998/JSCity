package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import eu.printingin3d.javascad.coords.Angles3d;
import eu.printingin3d.javascad.coords.Coords3d;
import eu.printingin3d.javascad.coords.Dims3d;
import eu.printingin3d.javascad.coords.Triangle3d;
import eu.printingin3d.javascad.enums.Side;
import eu.printingin3d.javascad.models.*;
import eu.printingin3d.javascad.tranzitions.Difference;
import eu.printingin3d.javascad.tranzitions.Union;

public class LegoBrick extends Union {
	private static final double WIDTH = 230.0;
	private static final double LENGTH  = 40.0;
	private static final double HEIGHT = 100;

	private static final double RADIUS = 4;

	public LegoBrick() {
		super(getModels());
	}



	private static List<Abstract3dModel> getModels() {
		List<Abstract3dModel> models = new ArrayList<>();
		//боковые части
		Difference generalBuilding1 = new Difference(
				new Cube(new Dims3d(WIDTH, LENGTH, HEIGHT)),//.move(Coords3d.yOnly(-8)).move(Coords3d.zOnly(-10)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(-105)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-25)),
				new Sphere(5).move(Coords3d.xOnly(-105)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(-12.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(-85)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-25)),
				new Sphere(5).move(Coords3d.xOnly(-85)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(-12.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(-65)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-25)),
				new Sphere(5).move(Coords3d.xOnly(-65)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(-12.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(-45)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-25)),
				new Sphere(5).move(Coords3d.xOnly(-45)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(-12.5)),

				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(105)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-25)),
				new Sphere(5).move(Coords3d.xOnly(105)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(-12.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(85)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-25)),
				new Sphere(5).move(Coords3d.xOnly(85)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(-12.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(65)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-25)),
				new Sphere(5).move(Coords3d.xOnly(65)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(-12.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-25)),
				new Sphere(5).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(-12.5)),


				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(-105)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(18)),
				new Sphere(5).move(Coords3d.xOnly(-105)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(30.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(-85)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(18)),
				new Sphere(5).move(Coords3d.xOnly(-85)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(30.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(-65)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(18)),
				new Sphere(5).move(Coords3d.xOnly(-65)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(30.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(-45)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(18)),
				new Sphere(5).move(Coords3d.xOnly(-45)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(30.5)),

				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(105)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(18)),
				new Sphere(5).move(Coords3d.xOnly(105)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(30.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(85)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(18)),
				new Sphere(5).move(Coords3d.xOnly(85)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(30.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(65)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(18)),
				new Sphere(5).move(Coords3d.xOnly(65)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(30.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-10, HEIGHT*0.25)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(18)),
				new Sphere(5).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(19.95)).move(Coords3d.zOnly(30.5)),


			new Cube(new Dims3d(WIDTH/23, LENGTH-15, HEIGHT*0.25)).move(Coords3d.xOnly(-22)).move(Coords3d.yOnly(31)).move(Coords3d.zOnly(-25)),
			new Cube(new Dims3d(WIDTH/23, LENGTH-15, HEIGHT*0.25)).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(31)).move(Coords3d.zOnly(-25)),
			new Cube(new Dims3d(WIDTH/23, LENGTH-15, HEIGHT*0.25)).move(Coords3d.xOnly(22)).move(Coords3d.yOnly(31)).move(Coords3d.zOnly(-25)),
			new Cube(new Dims3d(WIDTH/23, LENGTH-15, HEIGHT*0.25)).move(Coords3d.xOnly(-22)).move(Coords3d.yOnly(31)).move(Coords3d.zOnly(18)),
			new Cube(new Dims3d(WIDTH/23, LENGTH-15, HEIGHT*0.25)).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(31)).move(Coords3d.zOnly(18)),
			new Cube(new Dims3d(WIDTH/23, LENGTH-15, HEIGHT*0.25)).move(Coords3d.xOnly(22)).move(Coords3d.yOnly(31)).move(Coords3d.zOnly(18))
		);
		//центр
		Difference generalBuilding2 = new Difference(
				new Cube(new Dims3d(60, LENGTH+5, HEIGHT+30)).move(Coords3d.zOnly(15)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-15, HEIGHT*0.25)).move(Coords3d.xOnly(-22)).move(Coords3d.yOnly(31)).move(Coords3d.zOnly(-25)),
				new Sphere(5).move(Coords3d.xOnly(-22)).move(Coords3d.yOnly(20.95)).move(Coords3d.zOnly(-12.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-15, HEIGHT*0.25)).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(31)).move(Coords3d.zOnly(-25)),
				new Sphere(5).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(20.95)).move(Coords3d.zOnly(-12.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-15, HEIGHT*0.25)).move(Coords3d.xOnly(22)).move(Coords3d.yOnly(31)).move(Coords3d.zOnly(-25)),
				new Sphere(5).move(Coords3d.xOnly(22)).move(Coords3d.yOnly(20.95)).move(Coords3d.zOnly(-12.5)),

				new Cube(new Dims3d(WIDTH/23, LENGTH-15, HEIGHT*0.25)).move(Coords3d.xOnly(-22)).move(Coords3d.yOnly(31)).move(Coords3d.zOnly(18)),
				new Sphere(5).move(Coords3d.xOnly(-22)).move(Coords3d.yOnly(20.95)).move(Coords3d.zOnly(30.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-15, HEIGHT*0.25)).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(31)).move(Coords3d.zOnly(18)),
				new Sphere(5).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(20.95)).move(Coords3d.zOnly(30.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-15, HEIGHT*0.25)).move(Coords3d.xOnly(22)).move(Coords3d.yOnly(31)).move(Coords3d.zOnly(18)),
				new Sphere(5).move(Coords3d.xOnly(22)).move(Coords3d.yOnly(20.95)).move(Coords3d.zOnly(30.5)),

				new Cube(new Dims3d(WIDTH/23, LENGTH-15, HEIGHT*0.15)).move(Coords3d.xOnly(-22)).move(Coords3d.yOnly(31)).move(Coords3d.zOnly(61)),
				new Sphere(5).move(Coords3d.xOnly(-22)).move(Coords3d.yOnly(23.95)).move(Coords3d.zOnly(67.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-15, HEIGHT*0.15)).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(31)).move(Coords3d.zOnly(61)),
				new Sphere(5).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(23.95)).move(Coords3d.zOnly(67.5)),
				new Cube(new Dims3d(WIDTH/23, LENGTH-15, HEIGHT*0.15)).move(Coords3d.xOnly(22)).move(Coords3d.yOnly(31)).move(Coords3d.zOnly(61)),
				new Sphere(5).move(Coords3d.xOnly(22)).move(Coords3d.yOnly(23.95)).move(Coords3d.zOnly(67.5))




		);

		//нижняя полоска

		Difference generalBuilding3 = new Difference(
				new Cube(new Dims3d(WIDTH, LENGTH-5, 5)).move(Coords3d.yOnly(4))
		);
		//балкон

		Difference generalBuilding4 = new Difference(
				new Cube(new Dims3d(61, LENGTH-5, 5)).move(Coords3d.yOnly(20))
		);
		//балкон
		Difference generalBuilding5 = new Difference(
				new Cube(new Dims3d(61, 3, 15)).move(Coords3d.yOnly(36)).move(Coords3d.zOnly(10))
		);
		//балкон
		Difference generalBuilding6 = new Difference(
				new Cube(new Dims3d(3, 25, 15)).move(Coords3d.xOnly(29)).move(Coords3d.yOnly(22)).move(Coords3d.zOnly(10))
		);
		//балкон
		Difference generalBuilding7 = new Difference(
				new Cube(new Dims3d(3, 25, 15)).move(Coords3d.xOnly(-29)).move(Coords3d.yOnly(22)).move(Coords3d.zOnly(10))
		);

		//верхняя полоска

		Difference generalBuilding8 = new Difference(
				new Cube(new Dims3d(WIDTH, LENGTH-5, 5)).move(Coords3d.zOnly(40)).move(Coords3d.yOnly(4))
		);

	//средняя полоска

		Difference generalBuilding9 = new Difference(
				new Cube(new Dims3d(60, LENGTH-5, 5)).move(Coords3d.zOnly(40)).move(Coords3d.yOnly(7))
		);

	//верхняя полоска

		Difference generalBuilding10 = new Difference(
				new Cube(new Dims3d(60, LENGTH-5, 5)).move(Coords3d.zOnly(75)).move(Coords3d.yOnly(7))
		);


		models.add(generalBuilding1);
		models.add(generalBuilding2);
		models.add(generalBuilding3);
		models.add(generalBuilding4);
		models.add(generalBuilding5);
		models.add(generalBuilding6);
		models.add(generalBuilding7);
		models.add(generalBuilding8);
		models.add(generalBuilding9);
		models.add(generalBuilding10);


		return models;
	}

}
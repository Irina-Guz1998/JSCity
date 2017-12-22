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
	private static final double WIDTH = 550.0;
	private static final double LENGTH  = 40.0;
	private static final double HEIGHT = 280;

	private static final double RADIUS = 4;

	public LegoBrick() {
		super(getModels());
	}



	private static List<Abstract3dModel> getModels() {
		List<Abstract3dModel> models = new ArrayList<>();
		//осн часть
		Difference generalBuilding1 = new Difference(
				new Cube(new Dims3d(WIDTH, LENGTH, HEIGHT)),//.move(Coords3d.yOnly(-8)).move(Coords3d.zOnly(-10)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(-210)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-80)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(-210)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(1)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(-210)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(80)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(-130)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(80)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(-130)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-80)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(-130)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(1)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(-45)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(80)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(-45)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(1)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(-45)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-80)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(210)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-80)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(210)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(1)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(210)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(80)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(130)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(80)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(130)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-80)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(130)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(1)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(80)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(1)),
				new Cube(new Dims3d(35, LENGTH-10, 50)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-80)),
				new Cube(new Dims3d(30, LENGTH-10, 60)).move(Coords3d.xOnly(280)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(20)),
				new Cube(new Dims3d(30, LENGTH-10, 60)).move(Coords3d.xOnly(280)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(60)),
				new Cube(new Dims3d(30, LENGTH-10, 60)).move(Coords3d.xOnly(280)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(150)),
				new Cube(new Dims3d(30, LENGTH-10, 60)).move(Coords3d.xOnly(280)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(110)),
				new Cube(new Dims3d(30, LENGTH-10, 120)).move(Coords3d.xOnly(280)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-110))

		);
		Difference generalBuilding2 = new Difference(
				new Cube(new Dims3d(250, LENGTH, 420)).move(Coords3d.xOnly(370)).move(Coords3d.zOnly(70)),
				new Cube(new Dims3d(30, LENGTH-10, 60)).move(Coords3d.xOnly(280)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(20)),
				new Cube(new Dims3d(30, LENGTH-10, 60)).move(Coords3d.xOnly(280)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(120)),
				new Cube(new Dims3d(30, LENGTH-10, 60)).move(Coords3d.xOnly(280)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(220)),
				new Cube(new Dims3d(60, LENGTH-10, 60)).move(Coords3d.xOnly(360)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(20)),
				new Cube(new Dims3d(60, LENGTH-10, 60)).move(Coords3d.xOnly(360)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(120)),
				new Cube(new Dims3d(60, LENGTH-10, 60)).move(Coords3d.xOnly(360)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(220)),
				new Cube(new Dims3d(30, LENGTH-10, 60)).move(Coords3d.xOnly(440)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(20)),
				new Cube(new Dims3d(30, LENGTH-10, 60)).move(Coords3d.xOnly(440)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(120)),
				new Cube(new Dims3d(30, LENGTH-10, 60)).move(Coords3d.xOnly(440)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(220)),
				new Cube(new Dims3d(60, LENGTH-10, 120)).move(Coords3d.xOnly(360)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-110)),
				new Cube(new Dims3d(30, LENGTH-10, 120)).move(Coords3d.xOnly(280)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-110)),
				new Cube(new Dims3d(30, LENGTH-10, 120)).move(Coords3d.xOnly(440)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(-110))


		);

		Difference generalBuilding3 = new Difference(
				new Cube(new Dims3d(550, LENGTH-5, 47)).move(Coords3d.xOnly(0)).move(Coords3d.zOnly(155)),
				new Cube(new Dims3d(30, LENGTH-10, 60)).move(Coords3d.xOnly(280)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(120)),
				new Cube(new Dims3d(70, LENGTH-10, 60)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(70, LENGTH-10, 60)).move(Coords3d.xOnly(-130)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(70, LENGTH-10, 60)).move(Coords3d.xOnly(-210)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(70, LENGTH-10, 60)).move(Coords3d.xOnly(130)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(70, LENGTH-10, 60)).move(Coords3d.xOnly(-45)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(70, LENGTH-10, 60)).move(Coords3d.xOnly(210)).move(Coords3d.yOnly(30)).move(Coords3d.zOnly(140))



		);



		models.add(generalBuilding1);
		models.add(generalBuilding2);
		models.add(generalBuilding3);



		return models;
	}

}
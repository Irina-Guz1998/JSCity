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

public class Yavornitskiy extends Union {
	private static final double WIDTH = 40.0;
	private static final double HEIGHT = 50;
	private static final double AXLE_INNER_DIAMETER = 4.75;
	private static final double AXLE_OUTER_DIAMETER = 6.51;
	private static final double AXLE_ONE_DIAMETER = 3.0;
	private static final double KNOB_RADIUS = 8;
	private static final double KNOT_RADIUS = 0;

	public Yavornitskiy(int xSize, int ySize) {
		super(getModels(xSize, ySize));
	}



	private static List<Abstract3dModel> getModels(int xSize, int ySize) {
		List<Abstract3dModel> models = new ArrayList<>();

		Difference Tower = new Difference(
				new Cube(new Dims3d(30, 50 , 70)).move(Coords3d.xOnly(15)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(35)),
				new Cube(new Dims3d(10, 3, 25)).move(Coords3d.xOnly(5+10)).move(Coords3d.yOnly(1.5+48)).move(Coords3d.zOnly(12.5+7)),
				new Cube(new Dims3d(8, 2 , 17)).move(Coords3d.xOnly(4+5)).move(Coords3d.yOnly(1+49)).move(Coords3d.zOnly(8.5+39)),
				new Cube(new Dims3d(8, 2 , 12)).move(Coords3d.xOnly(4+5+8+4)).move(Coords3d.yOnly(1+49)).move(Coords3d.zOnly(6+39+5)),
				new Cylinder(3,4).rotate(Angles3d.xOnly(-90)).move(Coords3d.xOnly(4+5)).move(Coords3d.yOnly(4-2.5+49)).move(Coords3d.zOnly(4+52)),
				new Cylinder(3,4).rotate(Angles3d.xOnly(-90)).move(Coords3d.xOnly(4+5+12)).move(Coords3d.yOnly(4-2.5+49)).move(Coords3d.zOnly(4+52))
				);

		Difference Roof1 = new Difference(
				new Cube(new Dims3d(30, 50 , 20)).move(Coords3d.xOnly(15)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(10+70)),
				new Cube(new Dims3d(32, 50 , 50)).rotate(Angles3d.xOnly(-20)).move(Coords3d.xOnly(16-1)).move(Coords3d.yOnly(25+10)).move(Coords3d.zOnly(25+70+10)),
				new Cube(new Dims3d(32, 50 , 50)).rotate(Angles3d.xOnly(20)).move(Coords3d.xOnly(16-1)).move(Coords3d.yOnly(25-10)).move(Coords3d.zOnly(25+70+10)),
				new Cube(new Dims3d(32, 50 , 50)).rotate(Angles3d.yOnly(-20)).move(Coords3d.xOnly(16-1-9)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(25+70+7)),
				new Cube(new Dims3d(32, 50 , 50)).rotate(Angles3d.yOnly(20)).move(Coords3d.xOnly(16-1+9)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(25+70+7))
		);

		Difference Balcony = new Difference(
				new Cube(new Dims3d(26, 10 , 5)).move(Coords3d.xOnly(13+2)).move(Coords3d.yOnly(5+50)).move(Coords3d.zOnly(2.5+37)),
				new Cube(new Dims3d(24, 8 , 4)).move(Coords3d.xOnly(12+3)).move(Coords3d.yOnly(4+51)).move(Coords3d.zOnly(2+39)),
				new Cube(new Dims3d(8, 3 , 4)).move(Coords3d.xOnly(4+5)).move(Coords3d.yOnly(1.5+49)).move(Coords3d.zOnly(2+39))
		);

		Difference Hall = new Difference(
		        new Cube(new Dims3d(75, 45, 35)).move(Coords3d.xOnly(37.5-75)).move(Coords3d.yOnly(22.5)).move(Coords3d.zOnly(17.5)),
				new Cube(new Dims3d(10, 2, 20)).move(Coords3d.xOnly(5-15)).move(Coords3d.yOnly(1+44)).move(Coords3d.zOnly(10+12)),
				new Cube(new Dims3d(10, 2, 20)).move(Coords3d.xOnly(5-15-14)).move(Coords3d.yOnly(1+44)).move(Coords3d.zOnly(10+12)),
				new Cube(new Dims3d(10, 2, 20)).move(Coords3d.xOnly(5-15-28)).move(Coords3d.yOnly(1+44)).move(Coords3d.zOnly(10+12)),
				new Cube(new Dims3d(10, 2, 20)).move(Coords3d.xOnly(5-15-42)).move(Coords3d.yOnly(1+44)).move(Coords3d.zOnly(10+12)),
				new Cube(new Dims3d(10, 2, 20)).move(Coords3d.xOnly(5-15-56)).move(Coords3d.yOnly(1+44)).move(Coords3d.zOnly(10+12))
		        );

		Difference Border1 = new Difference(
		        new Cube(new Dims3d(30, 1, 7)).move(Coords3d.xOnly(15)).move(Coords3d.yOnly(0.5+50)).move(Coords3d.zOnly(3.5))
		        );

		Difference Border2 = new Difference(
		        new Cube(new Dims3d(75, 1, 7)).move(Coords3d.xOnly(37.5-75)).move(Coords3d.yOnly(0.5+45)).move(Coords3d.zOnly(3.5))
		        );

		Difference Stairs = new Difference(
				new Cube(new Dims3d(30, 10, 7)).move(Coords3d.xOnly(15)).move(Coords3d.yOnly(5+50)).move(Coords3d.zOnly(3.5)),
				new Cube(new Dims3d(11, 11, 2)).move(Coords3d.xOnly(5.5-1)).move(Coords3d.yOnly(5.5+50)).move(Coords3d.zOnly(1+6)),
				new Cube(new Dims3d(9.3, 11, 2)).move(Coords3d.xOnly(9.3/2-1)).move(Coords3d.yOnly(5.5+50)).move(Coords3d.zOnly(1+5)),
				new Cube(new Dims3d(7.6, 11, 2)).move(Coords3d.xOnly(7.6/2-1)).move(Coords3d.yOnly(5.5+50)).move(Coords3d.zOnly(1+4)),
				new Cube(new Dims3d(5.9, 11, 2)).move(Coords3d.xOnly(5.9/2-1)).move(Coords3d.yOnly(5.5+50)).move(Coords3d.zOnly(1+3)),
				new Cube(new Dims3d(4.2, 11, 2)).move(Coords3d.xOnly(4.2/2-1)).move(Coords3d.yOnly(5.5+50)).move(Coords3d.zOnly(1+2)),
				new Cube(new Dims3d(2.5, 11, 2)).move(Coords3d.xOnly(2.5/2-1)).move(Coords3d.yOnly(5.5+50)).move(Coords3d.zOnly(1+1)),
				new Cube(new Dims3d(11, 11, 2)).move(Coords3d.xOnly(5.5+20)).move(Coords3d.yOnly(5.5+50)).move(Coords3d.zOnly(1+6)),
				new Cube(new Dims3d(11, 11, 2)).move(Coords3d.xOnly(5.5+21.7)).move(Coords3d.yOnly(5.5+50)).move(Coords3d.zOnly(1+5)),
				new Cube(new Dims3d(11, 11, 2)).move(Coords3d.xOnly(5.5+23.4)).move(Coords3d.yOnly(5.5+50)).move(Coords3d.zOnly(1+4)),
				new Cube(new Dims3d(11, 11, 2)).move(Coords3d.xOnly(5.5+25.1)).move(Coords3d.yOnly(5.5+50)).move(Coords3d.zOnly(1+3)),
				new Cube(new Dims3d(11, 11, 2)).move(Coords3d.xOnly(5.5+26.8)).move(Coords3d.yOnly(5.5+50)).move(Coords3d.zOnly(1+2)),
				new Cube(new Dims3d(11, 11, 2)).move(Coords3d.xOnly(5.5+28.5)).move(Coords3d.yOnly(5.5+50)).move(Coords3d.zOnly(1+1))

		);

		Difference Roof_slab21 = new Difference(
				new Cube(new Dims3d(76, 47, 1)).move(Coords3d.xOnly(38-76)).move(Coords3d.yOnly(23.5-1)).move(Coords3d.zOnly(0.5+35))
		);
		Difference Roof_slab22 = new Difference(
				new Cube(new Dims3d(77, 49, 1)).move(Coords3d.xOnly(38.5-77)).move(Coords3d.yOnly(24.5-2)).move(Coords3d.zOnly(0.5+36))
		);
		Difference Roof_slab11 = new Difference(
				new Cube(new Dims3d(32, 52, 1)).move(Coords3d.xOnly(16-1)).move(Coords3d.yOnly(26-1)).move(Coords3d.zOnly(0.5+70))
		);
		Difference Roof_slab12 = new Difference(
				new Cube(new Dims3d(34, 54, 1)).move(Coords3d.xOnly(17-2)).move(Coords3d.yOnly(27-2)).move(Coords3d.zOnly(0.5+71))
		);

		Difference Roof2 = new Difference(
				new Cube(new Dims3d(76, 47, 15)).move(Coords3d.xOnly(38-76)).move(Coords3d.yOnly(23.5-1)).move(Coords3d.zOnly(7.5+37)),
				new Cube(new Dims3d(78, 47, 25)).rotate(Angles3d.xOnly(-25)).move(Coords3d.xOnly(39-77)).move(Coords3d.yOnly(23.5-1+17)).move(Coords3d.zOnly(7.5+37+10)),
				new Cube(new Dims3d(78, 47, 25)).rotate(Angles3d.xOnly(25)).move(Coords3d.xOnly(39-77)).move(Coords3d.yOnly(23.5-1-17)).move(Coords3d.zOnly(7.5+37+10)),
				new Cube(new Dims3d(78, 47, 25)).rotate(Angles3d.yOnly(-25)).move(Coords3d.xOnly(39-77-32)).move(Coords3d.yOnly(23.5-1)).move(Coords3d.zOnly(7.5+37+10))
		);




		models.add(Tower);
		models.add(Hall);
		models.add(Border1);
		models.add(Border2);
		models.add(Roof_slab21);
		models.add(Roof_slab22);
		models.add(Roof_slab11);
		models.add(Roof_slab12);
		models.add(Roof2);
		models.add(Roof1);
		models.add(Stairs);
		models.add(Balcony);


		return models;
	}
}
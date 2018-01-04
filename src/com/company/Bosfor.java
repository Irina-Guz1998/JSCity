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

public class Bosfor extends Union {
	private static final double WIDTH = 40.0;
	private static final double HEIGHT = 50;
	private static final double AXLE_INNER_DIAMETER = 4.75;
	private static final double AXLE_OUTER_DIAMETER = 6.51;
	private static final double AXLE_ONE_DIAMETER = 3.0;
	private static final double KNOB_RADIUS = 8;
	private static final double KNOT_RADIUS = 0;

	public Bosfor(int xSize, int ySize) {
		super(getModels(xSize, ySize));
	}



	private static List<Abstract3dModel> getModels(int xSize, int ySize) {
		List<Abstract3dModel> models = new ArrayList<>();
		//Правый блок (1)
		Difference rightBlockOne = new Difference(
				new Cube(new Dims3d(50, 50, 65)).move(Coords3d.xOnly(-100)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(32)),
		        new Cube(new Dims3d(8, 15, 20)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(7)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(15)).move(Coords3d.zOnly(17)),
		        new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(-15)).move(Coords3d.zOnly(17)),
		        new Cube(new Dims3d(2, 3, 18)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(10)).move(Coords3d.zOnly(29.5)),
				new Cube(new Dims3d(2, 3, 18)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(5)).move(Coords3d.zOnly(29.5)),
				new Cube(new Dims3d(2, 3, 18)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(29.5)),
				new Cube(new Dims3d(2, 3, 18)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(-5)).move(Coords3d.zOnly(29.5)),
				new Cube(new Dims3d(2, 3, 18)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(-10)).move(Coords3d.zOnly(29.5)),
				//
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(15)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(10)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(5)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(-5)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(-10)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(-15)).move(Coords3d.zOnly(50)),
				//
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(-115)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(-85)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(-90)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(-95)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(-100)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(-105)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(-110)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(17)),
				//
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-115)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-110)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-105)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-100)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-95)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-90)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-85)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(50)),
				//
				new Cube(new Dims3d(47, 47, 5)).move(Coords3d.xOnly(-100)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(65)),
				//
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(-115)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(-85)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(-90)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(-95)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(-100)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(-105)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(-110)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(17)),
				//
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-115)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-110)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-105)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-100)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-95)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-90)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-85)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(50))
				);
		Difference rightBlockOneWindowOne = new Difference(new Cube(new Dims3d(1, 33, 3)).move(Coords3d.xOnly(-125)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(50)));
		Difference rightBlockOneWindowTwo = new Difference(new Cube(new Dims3d(33, 1, 3)).move(Coords3d.xOnly(-100)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(50)));
		Difference rightBlockOneRoof = new Difference(new Cube(new Dims3d(30, 30, 10)).move(Coords3d.xOnly(-100)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(65)));
		Difference rightBlockOneStick = new Difference(new Cube(new Dims3d(2, 2, 65)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(32)));
		Difference rightBlockTwoWindowOne = new Difference(new Cube(new Dims3d(1, 33, 3)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(95)));
		Difference rightBlockTwoWindowTwo = new Difference(new Cube(new Dims3d(33, 1, 3)).move(Coords3d.xOnly(-50)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(95)));
		Difference rightBlockTwoRoof = new Difference(new Cube(new Dims3d(30, 30, 10)).move(Coords3d.xOnly(-50)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(110)));
		Difference rightBlockOneStick2 = new Difference(new Cube(new Dims3d(2, 2, 65)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(32)));
		Difference rightBlockOneWindowTwo2 = new Difference(new Cube(new Dims3d(33, 1, 3)).move(Coords3d.xOnly(-100)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(50)));
		Difference rightBlockTwoWindowTwo3 = new Difference(new Cube(new Dims3d(33, 1, 3)).move(Coords3d.xOnly(-50)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(95)));
		Difference rightBlockOneWindowOne2 = new Difference(new Cube(new Dims3d(1, 33, 3)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(140)));
		Difference rightBlockTwoStick = new Difference(new Cube(new Dims3d(2, 2, 110)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(54.5)));
		Difference rightBlockTwoStick2 = new Difference(new Cube(new Dims3d(2, 2, 110)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(54.5)));
		Difference rightBlockTwoWindowOne2 = new Difference(new Cube(new Dims3d(33, 1, 3)).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(140)));
		Difference rightBlockTwoWindowOne3 = new Difference(new Cube(new Dims3d(33, 1, 3)).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(140)));
		Difference rightBlockThreeRoof = new Difference(new Cube(new Dims3d(30, 30, 10)).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(155)));
		Difference midBlockWindowOne = new Difference(new Cube(new Dims3d(1, 33, 3)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(185)));
		Difference midBlockStick = new Difference(new Cube(new Dims3d(2, 2, 200)).move(Coords3d.xOnly(26)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(99.5)));
		Difference midBlockStick2 = new Difference(new Cube(new Dims3d(2, 2, 200)).move(Coords3d.xOnly(26)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(99.5)));
		Difference midBlockStick3 = new Difference(new Cube(new Dims3d(2, 2, 200)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(24)).move(Coords3d.zOnly(99.5)));
		Difference midBlockStick4 = new Difference(new Cube(new Dims3d(2, 2, 200)).move(Coords3d.xOnly(74)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(99.5)));
		Difference midBlockWindowOne2 = new Difference(new Cube(new Dims3d(33, 1, 3)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(185)));
		Difference midBlockWindowOne3 = new Difference(new Cube(new Dims3d(33, 1, 3)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(185)));
		Difference midBlockWindowOne4 = new Difference(new Cube(new Dims3d(1, 33, 3)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(185)));
		Difference midBlockRoof = new Difference(new Cube(new Dims3d(30, 30, 10)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(200)));
		Difference leftBlockThreeStick = new Difference(new Cube(new Dims3d(2, 2, 155)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(74)).move(Coords3d.zOnly(77)));
		Difference leftBlockThreeStick2 = new Difference(new Cube(new Dims3d(2, 2, 155)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(74)).move(Coords3d.zOnly(77)));
		Difference leftBlockThreeWindowOne = new Difference(new Cube(new Dims3d(33, 1, 3)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(140)));
		Difference leftBlockThreeWindowOne2 = new Difference(new Cube(new Dims3d(33, 1, 3)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(140)));
		Difference leftBlockThreeWindowOne3 = new Difference(new Cube(new Dims3d(1, 33, 3)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(50)).move(Coords3d.zOnly(140)));
		Difference leftBlockThreeWindowOne4 = new Difference(new Cube(new Dims3d(1, 33, 3)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(50)).move(Coords3d.zOnly(140)));
		Difference leftBlockThreeRoof = new Difference(new Cube(new Dims3d(30, 30, 10)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(50)).move(Coords3d.zOnly(155)));
		Difference leftBlockTwoWindow = new Difference(new Cube(new Dims3d(1, 33, 3)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(100)).move(Coords3d.zOnly(95)));
		Difference leftBlockTwoWindow2 = new Difference(new Cube(new Dims3d(1, 33, 3)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(100)).move(Coords3d.zOnly(95)));
		Difference leftBlockTwoWindow3 = new Difference(new Cube(new Dims3d(33, 1, 3)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(95)));
		Difference leftBlockOneStick = new Difference(new Cube(new Dims3d(2, 2, 65)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(32)));
		Difference leftBlockOneStick2 = new Difference(new Cube(new Dims3d(2, 2, 65)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(32)));
		Difference leftBlockTwoRoof = new Difference(new Cube(new Dims3d(30, 30, 10)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(100)).move(Coords3d.zOnly(110)));
		Difference leftBlockOneRoof = new Difference(new Cube(new Dims3d(30, 30, 10)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(150)).move(Coords3d.zOnly(65)));
		Difference leftBlockOneWindowOne = new Difference(new Cube(new Dims3d(1, 33, 3)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(150)).move(Coords3d.zOnly(50)));
		Difference leftBlockOneWindowTwo = new Difference(new Cube(new Dims3d(33, 1, 3)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(50)));
		Difference leftBlockOneWindowOne2 = new Difference(new Cube(new Dims3d(1, 33, 3)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(150)).move(Coords3d.zOnly(50)));

		//Правый блок (2)
		Difference rightBlockTwo = new Difference(
				new Cube(new Dims3d(50, 50, 110)).move(Coords3d.xOnly(-50)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(54.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(15)).move(Coords3d.zOnly(61.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(-15)).move(Coords3d.zOnly(61.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(10)).move(Coords3d.zOnly(61.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(5)).move(Coords3d.zOnly(61.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(61.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(-5)).move(Coords3d.zOnly(61.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(-10)).move(Coords3d.zOnly(61.5)),
				//
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(15)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(10)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(5)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(-5)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(-10)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-75)).move(Coords3d.yOnly(-15)).move(Coords3d.zOnly(95)),
				//
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(-65)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(-35)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(-45)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(-50)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(-55)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(-60)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(40.5)),
				//
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-65)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-60)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-55)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-50)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-45)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-35)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(95)),
				//
				new Cube(new Dims3d(47, 47, 5)).move(Coords3d.xOnly(-50)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(110)),
				//
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(-65)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(-35)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(-45)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(-50)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(-55)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(-60)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(40.5)),
				//
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-65)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-60)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-55)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-50)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-45)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-40)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-35)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(95))
				);

		//Правый блок (3)
		Difference rightBlockThree = new Difference(
				new Cube(new Dims3d(50, 50, 155)).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(77)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(15)).move(Coords3d.zOnly(106.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(-15)).move(Coords3d.zOnly(106.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(10)).move(Coords3d.zOnly(106.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(5)).move(Coords3d.zOnly(106.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(106.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(-5)).move(Coords3d.zOnly(106.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(-10)).move(Coords3d.zOnly(106.5)),
				//
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(15)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(10)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(5)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(-5)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(-10)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(-25)).move(Coords3d.yOnly(-15)).move(Coords3d.zOnly(140)),
				//
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(-15)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(15)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(10)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(5)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(-5)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(-10)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(57.5)),
				//
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-15)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-10)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-5)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(5)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(10)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(15)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(140)),
				//
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(-15)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(15)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(10)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(5)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(-5)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(-10)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(57.5)),
				//
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-15)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-10)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(-5)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(5)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(10)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(15)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(140)),
				//
				new Cube(new Dims3d(47, 47, 5)).move(Coords3d.xOnly(0)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(155))
		);

		//Средний блок
		Difference midBlock = new Difference(
				new Cube(new Dims3d(50, 50, 200)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(99.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(15)).move(Coords3d.zOnly(151.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(-15)).move(Coords3d.zOnly(151.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(10)).move(Coords3d.zOnly(151.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(5)).move(Coords3d.zOnly(151.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(151.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(-5)).move(Coords3d.zOnly(151.5)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(-10)).move(Coords3d.zOnly(151.5)),
				//
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(15)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(10)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(5)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(-5)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(-10)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(-15)).move(Coords3d.zOnly(185)),
				//
				new Cube(new Dims3d(3, 2, 174)).move(Coords3d.xOnly(35)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(3, 2, 174)).move(Coords3d.xOnly(65)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(3, 2, 174)).move(Coords3d.xOnly(60)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(3, 2, 174)).move(Coords3d.xOnly(55)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(3, 2, 174)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(3, 2, 174)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(3, 2, 174)).move(Coords3d.xOnly(40)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(86.5)),
				//
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(35)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(40)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(55)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(60)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(65)).move(Coords3d.yOnly(25)).move(Coords3d.zOnly(185)),
				////
				new Cube(new Dims3d(3, 2, 174)).move(Coords3d.xOnly(35)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(3, 2, 174)).move(Coords3d.xOnly(65)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(3, 2, 174)).move(Coords3d.xOnly(60)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(3, 2, 174)).move(Coords3d.xOnly(55)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(3, 2, 174)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(3, 2, 174)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(3, 2, 174)).move(Coords3d.xOnly(40)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(86.5)),
				//
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(35)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(40)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(55)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(60)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(65)).move(Coords3d.yOnly(-25)).move(Coords3d.zOnly(185)),
				//
				new Cube(new Dims3d(2, 3, 174)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(15)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(2, 3, 174)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(-15)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(2, 3, 174)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(10)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(2, 3, 174)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(5)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(2, 3, 174)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(2, 3, 174)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(-5)).move(Coords3d.zOnly(86.5)),
				new Cube(new Dims3d(2, 3, 174)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(-10)).move(Coords3d.zOnly(86.5)),
				//
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(15)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(10)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(5)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(-5)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(-10)).move(Coords3d.zOnly(185)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(-15)).move(Coords3d.zOnly(185)),
				//
				new Cube(new Dims3d(47, 47, 5)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(0)).move(Coords3d.zOnly(200))
		);

		//Левый блок (3)
		Difference leftBlockThree = new Difference(
				new Cube(new Dims3d(50, 50, 155)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(50)).move(Coords3d.zOnly(77)),
				new Cube(new Dims3d(2, 3, 140)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(35)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(2, 3, 140)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(65)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(2, 3, 140)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(60)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(2, 3, 140)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(55)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(2, 3, 140)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(50)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(2, 3, 140)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(45)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(2, 3, 140)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(40)).move(Coords3d.zOnly(57.5)),
				//
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(65)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(60)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(55)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(50)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(45)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(40)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(35)).move(Coords3d.zOnly(140)),
				//
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(35)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(65)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(60)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(55)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(3, 2, 140)).move(Coords3d.xOnly(40)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(57.5)),
				//
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(35)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(40)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(55)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(60)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(65)).move(Coords3d.yOnly(75)).move(Coords3d.zOnly(140)),
				//
				new Cube(new Dims3d(2, 3, 140)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(35)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(2, 3, 140)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(65)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(2, 3, 140)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(60)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(2, 3, 140)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(55)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(2, 3, 140)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(50)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(2, 3, 140)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(45)).move(Coords3d.zOnly(57.5)),
				new Cube(new Dims3d(2, 3, 140)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(40)).move(Coords3d.zOnly(57.5)),
				//
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(65)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(60)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(55)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(50)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(45)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(40)).move(Coords3d.zOnly(140)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(35)).move(Coords3d.zOnly(140)),
				//
				new Cube(new Dims3d(47, 47, 5)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(50)).move(Coords3d.zOnly(155))
		);

		//Левый блок (2)
		Difference leftBlockTwo = new Difference(
				new Cube(new Dims3d(50, 50, 110)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(100)).move(Coords3d.zOnly(54.5)),
				new Cube(new Dims3d(2, 3, 85)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(115)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(2, 3, 85)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(85)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(2, 3, 85)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(110)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(2, 3, 85)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(105)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(2, 3, 85)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(100)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(2, 3, 85)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(95)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(2, 3, 85)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(90)).move(Coords3d.zOnly(40.5)),
				//
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(115)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(110)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(105)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(100)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(95)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(90)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(85)).move(Coords3d.zOnly(95)),
				//
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(65)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(35)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(40)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(55)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(3, 2, 85)).move(Coords3d.xOnly(60)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(40.5)),
				//
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(65)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(60)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(55)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(40)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(35)).move(Coords3d.yOnly(125)).move(Coords3d.zOnly(95)),
				//
				new Cube(new Dims3d(47, 47, 5)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(100)).move(Coords3d.zOnly(110)),
				//
				new Cube(new Dims3d(2, 3, 85)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(115)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(2, 3, 85)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(85)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(2, 3, 85)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(110)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(2, 3, 85)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(105)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(2, 3, 85)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(100)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(2, 3, 85)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(95)).move(Coords3d.zOnly(40.5)),
				new Cube(new Dims3d(2, 3, 85)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(90)).move(Coords3d.zOnly(40.5)),
				//
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(115)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(110)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(105)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(100)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(95)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(90)).move(Coords3d.zOnly(95)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(85)).move(Coords3d.zOnly(95))
		);

		//Правый блок (1)
		Difference leftBlockOne = new Difference(
				new Cube(new Dims3d(50, 50, 65)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(150)).move(Coords3d.zOnly(32)),
				new Cube(new Dims3d(15, 8, 20)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(7)),
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(65)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(3, 2, 43)).move(Coords3d.xOnly(35)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(3, 2, 18)).move(Coords3d.xOnly(60)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(29.5)),
				new Cube(new Dims3d(3, 2, 18)).move(Coords3d.xOnly(55)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(29.5)),
				new Cube(new Dims3d(3, 2, 18)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(29.5)),
				new Cube(new Dims3d(3, 2, 18)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(29.5)),
				new Cube(new Dims3d(3, 2, 18)).move(Coords3d.xOnly(40)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(29.5)),
				//
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(65)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(60)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(55)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(45)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(40)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(3, 2, 15)).move(Coords3d.xOnly(35)).move(Coords3d.yOnly(175)).move(Coords3d.zOnly(50)),
				//
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(165)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(135)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(140)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(145)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(150)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(155)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(160)).move(Coords3d.zOnly(17)),
				//
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(165)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(160)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(155)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(150)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(145)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(140)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(25)).move(Coords3d.yOnly(135)).move(Coords3d.zOnly(50)),
				//
				new Cube(new Dims3d(47, 47, 5)).move(Coords3d.xOnly(50)).move(Coords3d.yOnly(150)).move(Coords3d.zOnly(65)),
				//
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(165)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(135)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(140)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(145)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(150)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(155)).move(Coords3d.zOnly(17)),
				new Cube(new Dims3d(2, 3, 43)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(160)).move(Coords3d.zOnly(17)),
				//
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(165)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(160)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(155)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(150)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(145)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(140)).move(Coords3d.zOnly(50)),
				new Cube(new Dims3d(2, 3, 15)).move(Coords3d.xOnly(75)).move(Coords3d.yOnly(135)).move(Coords3d.zOnly(50))
		);

		models.add(rightBlockOne);
		models.add(rightBlockOneWindowOne);
		models.add(rightBlockOneWindowTwo);
		models.add(rightBlockOneRoof);
		models.add(rightBlockTwo);
		models.add(rightBlockOneStick);
		models.add(rightBlockTwoWindowOne);
		models.add(rightBlockTwoWindowTwo);
		models.add(rightBlockTwoRoof);
		models.add(rightBlockOneStick2);
		models.add(rightBlockOneWindowTwo2);
		models.add(rightBlockTwoWindowTwo3);
		models.add(rightBlockThree);
		models.add(rightBlockOneWindowOne2);
		models.add(rightBlockTwoStick);
		models.add(rightBlockTwoStick2);
		models.add(rightBlockTwoWindowOne2);
		models.add(rightBlockTwoWindowOne3);
		models.add(rightBlockThreeRoof);
		models.add(midBlock);
		models.add(midBlockWindowOne);
		models.add(midBlockStick);
		models.add(midBlockStick2);
		models.add(midBlockStick3);
		models.add(midBlockStick4);
		models.add(midBlockWindowOne2);
		models.add(midBlockWindowOne3);
		models.add(midBlockWindowOne4);
		models.add(midBlockRoof);
		models.add(leftBlockThree);
		models.add(leftBlockThreeStick);
		models.add(leftBlockThreeStick2);
		models.add(leftBlockThreeWindowOne);
		models.add(leftBlockThreeWindowOne2);
		models.add(leftBlockThreeWindowOne3);
		models.add(leftBlockThreeWindowOne4);
		models.add(leftBlockThreeRoof);
		models.add(leftBlockTwo);
		models.add(leftBlockTwoWindow);
		models.add(leftBlockTwoWindow2);
		models.add(leftBlockTwoWindow3);
		models.add(leftBlockOneStick);
		models.add(leftBlockOneStick2);
		models.add(leftBlockTwoRoof);
		models.add(leftBlockOne);
		models.add(leftBlockOneRoof);
		models.add(leftBlockOneWindowOne);
		models.add(leftBlockOneWindowTwo);
		models.add(leftBlockOneWindowOne2);
		return models;
	}
}
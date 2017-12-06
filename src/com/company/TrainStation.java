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

public class TrainStation extends Union {
	private static final double WIDTH = 40.0;
	private static final double HEIGHT = 40;
	private static final double AXLE_INNER_DIAMETER = 4.75;
	private static final double AXLE_OUTER_DIAMETER = 6.51;
	private static final double AXLE_ONE_DIAMETER = 3.0;
	private static final double KNOB_DIAMETER = 4;
	private static final double KNOB_HEIGTH = 1.8;
	
	public TrainStation(int xSize, int ySize) {
		super(getModels(xSize, ySize));
	}



	private static List<Abstract3dModel> getModels(int xSize, int ySize) {
		List<Abstract3dModel> models = new ArrayList<>();
		//Главный зал
		Difference generalBuilding = new Difference(
						new Cube(new Dims3d(WIDTH*xSize, WIDTH*0.6, HEIGHT*1.5)).move(Coords3d.yOnly(-8)).move(Coords3d.zOnly(-10)),
						new Cube(new Dims3d(WIDTH*0.6, WIDTH/2, HEIGHT/2)).move(Coords3d.yOnly(-4)).move(Coords3d.zOnly(8)),
						new Sphere(10),
						new Sphere(5).move(Coords3d.zOnly(-20))
				);
		//Боковые постройки от главного входа
		Difference sideBuildings = new Difference(
				new Cube(new Dims3d(WIDTH*xSize, WIDTH*0.6, HEIGHT)).move(Coords3d.yOnly(-8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(27)).move(Coords3d.zOnly(-8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(8)).move(Coords3d.zOnly(-8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(-27)).move(Coords3d.zOnly(-8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(-8)).move(Coords3d.zOnly(-8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(27)).move(Coords3d.zOnly(8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(8)).move(Coords3d.zOnly(8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(-27)).move(Coords3d.zOnly(8)),
				new Cube(new Dims3d(WIDTH/4, WIDTH*0.8, HEIGHT/3)).move(Coords3d.xOnly(-8)).move(Coords3d.zOnly(8))
		);

		Difference roofSideBuildings = new Difference(
				new Cube(new Dims3d(WIDTH*xSize, WIDTH, HEIGHT/50)).move(Coords3d.zOnly(-20))
		);

		Difference floor = new Difference(
				new Cube(new Dims3d(WIDTH*7, WIDTH, HEIGHT/50)).move(Coords3d.zOnly(20))
		);

		Difference roofGenereal = new Difference(
				new Cube(new Dims3d(WIDTH, WIDTH/3, HEIGHT)).move(Coords3d.zOnly(-35)).rotate(Angles3d.yOnly(45)).move(Coords3d.xOnly(24)).move(Coords3d.yOnly(-10)),
				new Cube(new Dims3d(WIDTH*2, WIDTH, HEIGHT)).move(Coords3d.zOnly(2))
		);

		Difference roofGenereal2 = new Difference(
				new Cube(new Dims3d(WIDTH*3.1, WIDTH*1.5, HEIGHT/50)).move(Coords3d.zOnly(-40)).move(Coords3d.yOnly(10)),
				new Cube(new Dims3d(WIDTH*4,20,20)).move(Coords3d.zOnly(-40)).move(Coords3d.yOnly(35)),
				new Cube(new Dims3d(WIDTH*1.8,20,20)).move(Coords3d.zOnly(-40)).move(Coords3d.yOnly(17))
		);

		//Башни между боковыми постройками и главным зданием
		Difference tower = new Difference(
				new Cube(new Dims3d(WIDTH*0.5, WIDTH, HEIGHT*1.5)).move(Coords3d.zOnly(-10))
		);

		Difference onTower = new Difference(
				new Cube(new Dims3d(WIDTH*0.5, WIDTH/2, HEIGHT/2)).move(Coords3d.zOnly(-50)).move(Coords3d.yOnly(10))
		);

		Difference stair = new Difference(
				new Cube(new Dims3d(WIDTH*xSize, WIDTH*0.6, HEIGHT/50)).move(Coords3d.yOnly(8)).move(Coords3d.zOnly(19.5))
		);

		Difference stair2 = new Difference(
				new Cube(new Dims3d(WIDTH*xSize, WIDTH*0.6, HEIGHT/50)).move(Coords3d.yOnly(6)).move(Coords3d.zOnly(19))
		);

		Difference stair3 = new Difference(
				new Cube(new Dims3d(WIDTH*xSize, WIDTH*0.6, HEIGHT/50)).move(Coords3d.yOnly(4)).move(Coords3d.zOnly(18.5))
		);

		Difference stair4 = new Difference(
				new Cube(new Dims3d(WIDTH*xSize, WIDTH*0.6, HEIGHT/50)).move(Coords3d.yOnly(2)).move(Coords3d.zOnly(18))
		);

		Difference sideUp = new Difference(
				new Cube(new Dims3d(WIDTH*xSize, WIDTH*0.6, 3.2)).move(Coords3d.yOnly(8)).move(Coords3d.zOnly(18))
		);

		Difference colon = new Difference(
				new Cylinder(HEIGHT,KNOB_DIAMETER).move(Coords3d.yOnly(15))
		);

		models.add(generalBuilding);
		models.add(floor);
		models.add(roofGenereal);
		models.add(roofGenereal2);
		models.add(sideUp.move(Coords3d.xOnly(100)));
		models.add(sideUp.move(Coords3d.xOnly(-100)));
		models.add(stair);
		models.add(stair2);
		models.add(stair3);
		models.add(stair4);
		models.add(colon.move(Coords3d.xOnly(100)));
		models.add(colon.move(Coords3d.xOnly(117.5)));
		models.add(colon.move(Coords3d.xOnly(82.5)));
		models.add(colon.move(Coords3d.xOnly(135)));
		models.add(colon.move(Coords3d.xOnly(65)));
		models.add(colon.move(Coords3d.xOnly(-100)));
		models.add(colon.move(Coords3d.xOnly(-117.5)));
		models.add(colon.move(Coords3d.xOnly(-82.5)));
		models.add(colon.move(Coords3d.xOnly(-135)));
		models.add(colon.move(Coords3d.xOnly(-65)));
		models.add(roofSideBuildings.move(Coords3d.xOnly(100)));
		models.add(roofSideBuildings.move(Coords3d.xOnly(-100)));
		models.add(onTower.move(Coords3d.xOnly(50)));
		models.add(onTower.move(Coords3d.xOnly(-50)));
		models.add(tower.move(Coords3d.xOnly(50)));
		models.add(tower.move(Coords3d.xOnly(-50)));
		models.add(sideBuildings.move(Coords3d.xOnly(100)));
		models.add(sideBuildings.move(Coords3d.xOnly(-100)));
		//models.add(getKnobs(base, xSize, ySize));
		return models;
	}

	// Из этого потом сделаю колоны
	/*private static Abstract3dModel getKnobs(Abstract3dModel base, int xSize, int ySize) {
		List<Coords3d> moves = new ArrayList<>();
		for (int x=0;x<xSize;x++) {
			for (int y=0;y<ySize;y++) {
				moves.add(new Coords3d((x-(xSize-1.0)/2.0)*ONE_SEGMENT_WIDTH, (y-(ySize-1.0)/2.0)*ONE_SEGMENT_WIDTH, 0.0));
			}
		}
		return getKnob(base).moves(moves);
	}

	private static Abstract3dModel getKnob(Abstract3dModel base) {
		return new Cylinder(KNOB_HEIGTH, KNOB_DIAMETER/2.0);
	}
	*/
	private static Abstract3dModel getAxle() {
		return new Difference(
				new Cylinder(HEIGHT, AXLE_OUTER_DIAMETER/2.0),
				new Cylinder(HEIGHT, AXLE_INNER_DIAMETER/2.0).move(Coords3d.zOnly(-0.01))
		);
	}
	
	private static Abstract3dModel getAxleOne() {
		return new Cylinder(HEIGHT, AXLE_ONE_DIAMETER/2.0);
	}
}

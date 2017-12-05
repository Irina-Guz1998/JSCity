package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import eu.printingin3d.javascad.coords.Coords3d;
import eu.printingin3d.javascad.coords.Dims3d;
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
	private static final double KNOB_DIAMETER = 4.85;
	private static final double KNOB_HEIGTH = 1.8;
	
	public TrainStation(int xSize, int ySize) {
		super(getModels(xSize, ySize));
	}

	private static List<Abstract3dModel> getModels(int xSize, int ySize) {
		List<Abstract3dModel> models = new ArrayList<>();
		//Главный зал
		Difference generalBuilding = new Difference(
						new Cube(new Dims3d(WIDTH*xSize, WIDTH, HEIGHT))
				);
		//Боковые постройки от главного входа
		Difference sideBuildings = new Difference(
				new Cube(new Dims3d(WIDTH*xSize, WIDTH, HEIGHT))
		);
		//Башни между боковыми постройками и главным зданием
		Difference tower = new Difference(
				new Cube(new Dims3d(WIDTH*0.5, WIDTH, HEIGHT*1.5)).move(Coords3d.zOnly(-10))
		);

		Difference onTower = new Difference(
				new Cube(new Dims3d(WIDTH*0.5, WIDTH/2, HEIGHT/2)).move(Coords3d.zOnly(-50)).move(Coords3d.yOnly(10))
		);


		models.add(generalBuilding);
		models.add(onTower.move(Coords3d.xOnly(55)));
		models.add(onTower.move(Coords3d.xOnly(-55)));
		models.add(tower.move(Coords3d.xOnly(55)));
		models.add(tower.move(Coords3d.xOnly(-55)));
		models.add(sideBuildings.move(Coords3d.xOnly(110)));
		models.add(sideBuildings.move(Coords3d.xOnly(-110)));
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
		return new Cylinder(KNOB_HEIGTH, KNOB_DIAMETER/2.0).align(Side.TOP, base, false);
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

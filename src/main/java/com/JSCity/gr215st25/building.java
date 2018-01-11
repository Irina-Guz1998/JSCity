package com.JSCity.gr215st25;

import java.util.ArrayList;
import java.util.List;

import eu.printingin3d.javascad.coords.Coords3d;
import eu.printingin3d.javascad.coords.Dims3d;
import eu.printingin3d.javascad.models.Abstract3dModel;
import eu.printingin3d.javascad.models.Cube;
import eu.printingin3d.javascad.models.Cylinder;
import eu.printingin3d.javascad.tranzitions.Difference;
import eu.printingin3d.javascad.tranzitions.Union;

class building extends Union {
    private static final int myCoords1 = -400;
    private static final int myCoords2 = -440;

    building() {
        super(getModels());
    }

    private static List<Abstract3dModel> getModels() {
        List<Abstract3dModel> models = new ArrayList<Abstract3dModel>();
        Union first = new Union(
                new Cube(new Dims3d(1000, 300, 300)),
                new Cube(new Dims3d(1000, 400, 20)).move(new Coords3d(0, 50, -160)),
                new Cube(new Dims3d(1000, 400, 100)).move(new Coords3d(0, 50, 200)),
                new Cube(new Dims3d(1040, 440, 20)).move(new Coords3d(0, 50, 190)),
                new Cube(new Dims3d(100, 10, 50)).move(new Coords3d(0, 250, 250))
        );
        List<Abstract3dModel> columns = new ArrayList<Abstract3dModel>();
        for (int i = myCoords2; i < 450; i += 110) {
            columns.add(new Cylinder(300, 25).move(new Coords3d(i, 200, 0)));
        }
        Union second = new Union(
            columns
        );
        Difference third = new Difference(
                first,
                new Cube(new Dims3d(900, 300, 50)).move(new Coords3d(0, 50, 250)),
                new Cube(new Dims3d(40, 20, 60)).move(new Coords3d(0, 250, 0)),
                new Cube(new Dims3d(50, 20, 90)).move(new Coords3d(0, 150, -100))
        );
        List<Abstract3dModel> windows = new ArrayList<Abstract3dModel>();
        for (int i = myCoords1; i <= 400; i += 80) {
            windows.add(new Cube(new Dims3d(40, 20, 60)).move(new Coords3d(i, 150, 90)));
            windows.add(new Cube(new Dims3d(40, 20, 60)).move(new Coords3d(i, 150, 0)));
            windows.add(new Cube(new Dims3d(40, 20, 60)).move(new Coords3d(i, 150, -90)));
        }
        Difference fourth = new Difference(
                third,
                windows
        );
        models.add(second);
        models.add(fourth);
        return models;
    }
}
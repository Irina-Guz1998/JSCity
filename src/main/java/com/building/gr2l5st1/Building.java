package com.building.gr2l5st1;
import java.util.ArrayList;
import java.util.List;

import eu.printingin3d.javascad.coords.Angles3d;
import eu.printingin3d.javascad.models.Abstract3dModel;
import eu.printingin3d.javascad.models.Sphere;
import eu.printingin3d.javascad.coords.Coords3d;
import eu.printingin3d.javascad.coords.Dims3d;
import eu.printingin3d.javascad.models.*;
import eu.printingin3d.javascad.tranzitions.Difference;
import eu.printingin3d.javascad.tranzitions.Union;

class Building extends Union {
    private static int floorsCount = 20;
    private static int floorHeight = 20;
    private static int floorsLength = 800;
    private static int floorsOffset = 160;


    Building() {
        super(getModels());
    }

    private static List<Abstract3dModel> getModels() {
        //полная модель
        List<Abstract3dModel> models = new ArrayList<Abstract3dModel>();

        Union first = new Union(
                //основные блоки
                new Cube(new Dims3d(200, 100, floorsLength)).move(Coords3d.zOnly(160)),
                new Cube(new Dims3d(100, 100, 300)).rotate(Angles3d.yOnly(-20)).move(new Coords3d(70, 0, -300)),
                new Cube(new Dims3d(100, 100, 300)).rotate(Angles3d.yOnly(20)).move(new Coords3d(-70, 0, -300)),
                new Cube(new Dims3d(100, 50, 150)).move(new Coords3d(0, 0, - 330))

        );
        models.add(first);

        List<Abstract3dModel> mainFloors1 = new ArrayList<Abstract3dModel>();
        for(int i = 0; i < floorsCount / 2; i++) {
            mainFloors1.add(new Cube(new Dims3d(200, 20, floorsLength)).move(new Coords3d(0, floorHeight, floorsOffset)));
            floorHeight += 40;
            floorsLength -= 15;
            floorsOffset -= 20;
        }
        Union second = new Union(
                mainFloors1
        );
        models.add(second);

        List<Abstract3dModel> mainFloors2 = new ArrayList<Abstract3dModel>();
        for(int i = 0; i < floorsCount / 2; i++) {
            mainFloors2.add(new Cube(new Dims3d(200, 20, floorsLength)).move(new Coords3d(0, floorHeight, -20)));
            floorHeight += 40;
        }
        Union addFloors = new Union(
                mainFloors2
        );
        models.add(addFloors);

        List<Abstract3dModel> rightFloors = new ArrayList<Abstract3dModel>();
        floorHeight = 20;
        for(int i = 0; i < floorsCount; i++) {
            rightFloors.add(new Cube(new Dims3d(100, 20, 300)).rotate(Angles3d.yOnly(-20)).move(new Coords3d(70, floorHeight, -300)));
            floorHeight += 40;
        }
        Union third = new Union(
                rightFloors
        );
        models.add(third);

        List<Abstract3dModel> leftFloors = new ArrayList<Abstract3dModel>();
        floorHeight = 20;
        for(int i = 0; i < floorsCount; i++) {
            leftFloors.add(new Cube(new Dims3d(100, 20, 300)).rotate(Angles3d.yOnly(20)).move(new Coords3d(-70, floorHeight, -300)));
            floorHeight += 40;
        }
        Union fourth = new Union(
                leftFloors
        );
        models.add(fourth);

        Union fifth = new Union(
                fourth,
                new Cube(new Dims3d(100, 900, 300)).move(new Coords3d(0, 470, - 230)),
                new Cube(new Dims3d(150, 70, 450)).move(new Coords3d(0, 820, -10)),
                new Cube(new Dims3d(50, 70, 200)).rotate(Angles3d.yOnly(-20)).move(new Coords3d(70, 820, -300)),
                new Cube(new Dims3d(50, 70, 200)).rotate(Angles3d.yOnly(20)).move(new Coords3d(-70, 820, -300))
        );
        models.add(fifth);
        return models;
    }
}
package com.building.gr215st18;
import java.util.ArrayList;
import java.util.List;

import eu.printingin3d.javascad.models.Abstract3dModel;
import eu.printingin3d.javascad.coords.Coords3d;
import eu.printingin3d.javascad.coords.Dims3d;
import eu.printingin3d.javascad.models.*;
import eu.printingin3d.javascad.tranzitions.Difference;
import eu.printingin3d.javascad.tranzitions.Union;

class building extends Union {
    building() {
        super(getModels());
    }

    private static List<Abstract3dModel> getModels() {
        //полная модель
        List<Abstract3dModel> models = new ArrayList<Abstract3dModel>();

        Union first = new Union(
                //основные блоки
                new Cube(new Dims3d(800, 400, 600)),
                new Cube(new Dims3d(600, 10, 50)).move(new Coords3d(0, -100, -320)),
                new Cube(new Dims3d(700, 400, 400)).move(new Coords3d(0, 0, 500)),
                new Cube(new Dims3d(600, 350, 400)).move(new Coords3d(0, 350, 500)),
                new Cube(new Dims3d(700, 50, 350)).move(new Coords3d(0, 230, 130))

        );
        Difference second = new Difference(
                first,
                new Cube(new Dims3d(500, 50, 20)).move(new Coords3d(0, 450, 300)),
                new Cube(new Dims3d(20, 250, 50)).move(new Coords3d(-300, 350, 600)),
                new Cube(new Dims3d(20, 250, 50)).move(new Coords3d(300, 350, 600)),
                new Cube(new Dims3d(550, 50, 350)).move(new Coords3d(0, 510, 500))
        );
        List<Abstract3dModel> additionalWindows = new ArrayList<Abstract3dModel>();
        int myCoords1 = 650;
        for(int i = 0; i < 6; i++) {
            additionalWindows.add(new Cube(new Dims3d(20, 30, 20)).move(new Coords3d(350, 100, myCoords1)));
            additionalWindows.add(new Cube(new Dims3d(20, 30, 20)).move(new Coords3d(350, -100, myCoords1)));
            additionalWindows.add(new Cube(new Dims3d(20, 30, 20)).move(new Coords3d(-350, 100, myCoords1)));
            additionalWindows.add(new Cube(new Dims3d(20, 30, 20)).move(new Coords3d(-350, -100, myCoords1)));
            myCoords1 -= 50;
        }
        Difference third = new Difference(
                second,
                additionalWindows
        );
        Difference fourth = new Difference(
                third,
                new Cube(new Dims3d(850, 100, 100)).move(new Coords3d(0, -160, -300)),
                new Cube(new Dims3d(100, 100, 650)).move(new Coords3d(400, -160, -20)),
                new Cube(new Dims3d(100, 100, 650)).move(new Coords3d(-400, -160, -20))
        );
        List<Abstract3dModel> doors = new ArrayList<Abstract3dModel>();
        int myCoords2 = 300;
        for(int i = 0; i < 7; i++) {
            doors.add(new Cube(new Dims3d(50, 80, 30)).move(new Coords3d(myCoords2, -160, -240)));
            myCoords2 -= 100;
        }
        Difference fifth = new Difference(
                fourth,
                doors
        );
        List<Abstract3dModel> frontWindows = new ArrayList<Abstract3dModel>();
        int myCoords3 = 345;
        for(int i = 0; i < 10; i++) {
            frontWindows.add(new Cube(new Dims3d(65, 260, 20)).move(new Coords3d(myCoords3, 50, -300)));
            myCoords3 -= 75;
        }
        Difference sixth = new Difference(
                fifth,
                frontWindows
        );
        List<Abstract3dModel> sideWindows = new ArrayList<Abstract3dModel>();
        int myCoords4 = 225;
        for(int i = 0; i < 7; i++) {
            sideWindows.add(new Cube(new Dims3d(20, 260, 65)).move(new Coords3d(400, 50, myCoords4)));
            sideWindows.add(new Cube(new Dims3d(20, 260, 65)).move(new Coords3d(-400, 50, myCoords4)));
            myCoords4 -= 75;
        }
        Difference seventh = new Difference(
                sixth,
                sideWindows
        );
        models.add(seventh);
        return models;
    }
}
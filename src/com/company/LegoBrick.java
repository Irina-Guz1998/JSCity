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
    private static final double WIDTH = 75.0;
    private static final double HEIGHT = 60;
    private static final double KNOB_DIAMETER = 4;

    public LegoBrick() {
        super(getModels());
    }



    private static List<Abstract3dModel> getModels() {
        List<Abstract3dModel> models = new ArrayList<>();
        //Главный зал
        Difference generalBuilding = new Difference(
                new Cube(new Dims3d(WIDTH*2, WIDTH*0.4, HEIGHT*1.5)).move(Coords3d.yOnly(-8)).move(Coords3d.zOnly(-10)),
                new Cube(new Dims3d(WIDTH*0.3, WIDTH, HEIGHT/2)).move(Coords3d.yOnly(-20)).move(Coords3d.zOnly(18)),
                new Sphere(11.5).move(Coords3d.zOnly(8))

        );
        Difference roofGenereal = new Difference(
                new Cube(new Dims3d(WIDTH, WIDTH/3, HEIGHT*1.5)).move(Coords3d.zOnly(-35)).rotate(Angles3d.yOnly(45)).move(Coords3d.xOnly(30)).move(Coords3d.yOnly(-10)),
                new Cube(new Dims3d(WIDTH*2, WIDTH, HEIGHT)).move(Coords3d.zOnly(2))
        );
        Difference floor = new Difference(
                new Cube(new Dims3d(WIDTH*2, WIDTH-20, HEIGHT/50)).move(Coords3d.zOnly(20)));


        Difference sideUp = new Difference(
                new Cube(new Dims3d(WIDTH*2, WIDTH*0.6, 3.2)).move(Coords3d.yOnly(8)).move(Coords3d.zOnly(18))
        );

        Difference colon = new Difference(
                new Cylinder(HEIGHT+10,KNOB_DIAMETER).move(Coords3d.yOnly(15))
        );

        models.add(generalBuilding);
        models.add(colon.move(Coords3d.xOnly(-15)));
        models.add(colon.move(Coords3d.xOnly(-45)));
        models.add(colon.move(Coords3d.xOnly(15)));
        models.add(colon.move(Coords3d.xOnly(45)));
        models.add(roofGenereal.move(Coords3d.yOnly(18)));
        models.add(floor.move(Coords3d.zOnly(15)).move(Coords3d.yOnly(10)));

                      return models;
    }

}

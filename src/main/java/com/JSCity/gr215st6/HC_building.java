package com.JSCity.gr215st6;
import java.util.ArrayList;
import java.util.List;

import eu.printingin3d.javascad.models.Abstract3dModel;
import eu.printingin3d.javascad.models.Sphere;
import eu.printingin3d.javascad.coords.Coords3d;
import eu.printingin3d.javascad.coords.Dims3d;
import eu.printingin3d.javascad.models.*;
import eu.printingin3d.javascad.tranzitions.Difference;
import eu.printingin3d.javascad.tranzitions.Union;

class HC_building extends Union {
    private static final int basicSize = 400;
    private static final int myCoords1[] = {-133, -67, 0, 67, 133};
    private static final int myCoords2[] = {-80, -20, 40};

    HC_building() { super(getModels()); }

    private static List<Abstract3dModel> getModels() {
        //полная модель
        List<Abstract3dModel> models = new ArrayList<Abstract3dModel>();

        //добавляюшиеся элементы, которые повторяются
        List<Abstract3dModel> addedComponents = new ArrayList<Abstract3dModel>();
        for(int i = 0; i < 5; i++) {
            //перепонки окон
            addedComponents.add(new Cube(new Dims3d(5, basicSize / 2.8, 5)).move(new Coords3d(myCoords1[i], 0, 45)));
        }
        Union basis = new Union(
                //передняя часть
                new Cube(new Dims3d(basicSize, basicSize / 1.5, basicSize / 4)),
                new Cube(new Dims3d(basicSize / 2, 20, basicSize / 4)).move(new Coords3d(0, 140, 0)),
                new Cube(new Dims3d(basicSize / 4, 20, basicSize / 4)).move(new Coords3d(0, 160, 0)),
                //основное здание
                new Cube(new Dims3d(basicSize * 2, basicSize / 1.5, basicSize * 2.5)).move(Coords3d.zOnly(-550)),
                //перепонки окон
                (Abstract3dModel) addedComponents,
                new Cube(new Dims3d(basicSize, 5, 5)).move(new Coords3d(0, 0, 45)),
                new Cube(new Dims3d(basicSize, 5, 5)).move(new Coords3d(0, -20, 45))
        );

        //вычетающиеся элементы, которые повторяются
        List<Abstract3dModel> differencingElements = new ArrayList<Abstract3dModel>();
        for(int i = 0; i < 5; i++) {
            //двери
            differencingElements.add(new Cube(new Dims3d(basicSize / 12, basicSize / 7, 100)).move(new Coords3d(myCoords1[i], -105, 45)));
            //арки
            differencingElements.add(new Sphere(basicSize / 24 + 1).move(new Coords3d(myCoords1[i], 45, 55)));
            differencingElements.add(new Cube(new Dims3d(basicSize / 12, basicSize / 3.5, 20)).move(new Coords3d(myCoords1[i], -10, 45)));
            //окна в арках
            differencingElements.add(new Cube(new Dims3d(basicSize / 14, basicSize / 3.8, 100)).move(new Coords3d(myCoords1[i], -10, 45)));
        }
        for(int i = 0; i < 3; i++) {
            //боковые окна
            differencingElements.add(new Cube(new Dims3d(basicSize / 12, basicSize / 10, 20)).move(new Coords3d(-250, myCoords2[i], -55)));
            differencingElements.add(new Cube(new Dims3d(basicSize / 12, basicSize / 10, 20)).move(new Coords3d(250, myCoords2[i], -55)));
        }
        Difference differ = new Difference(
                basis,
                //углубление крыши
                new Cube(new Dims3d(basicSize * 2 - 40, 40, basicSize * 2.5 - 60)).move(new Coords3d(0, 120, -550)),
                (Abstract3dModel) differencingElements
        );
        models.add(differ);
        return models;
    }
}
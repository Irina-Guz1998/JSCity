package com.building.gr2l5st26;

import java.io.File;
import java.io.IOException;

import eu.printingin3d.javascad.exceptions.IllegalValueException;
import eu.printingin3d.javascad.utils.SaveScadFiles;

public class Main {

    /**
     * @param args
     * @throws IOException
     * @throws IllegalValueException
     */
    public static void main(String[] args) throws IllegalValueException, IOException {
        new SaveScadFiles(new File("./target")).
                addModel("building_gr2l5st26.scad", new Building(2,1)).
                saveScadFiles();
    }
}

package com.building.gr415st3;

import eu.printingin3d.javascad.exceptions.IllegalValueException;
import eu.printingin3d.javascad.utils.SaveScadFiles;

import java.io.File;
import java.io.IOException;

public class Main {
    /**
     * @param args
     * @throws IOException
     * @throws IllegalValueException
     */
    public static void main(String[] args) throws IllegalValueException, IOException {
        new SaveScadFiles(new File("./target")).
                addModel("building_gr4l5st3.scad", new Building()).
                saveScadFiles();
    }
}
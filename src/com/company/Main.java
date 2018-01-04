package com.company;

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
        new SaveScadFiles(new File("D:\\Учеба\\Учеба 4\\Твердотельное проектирование\\Лаба 5\\Laba_5")).
                addModel("Menora.scad", new Bosfor(2,1)).
                saveScadFiles();
    }
}

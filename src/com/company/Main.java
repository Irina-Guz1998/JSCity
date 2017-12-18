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
        new SaveScadFiles(new File("D:\\SASHA\\Вуз_Учеба\\4 курс\\твердотельное проектирование технических объектов\\lab5_new")).
                addModel("yavornitskiy.scad", new Yavornitskiy(2,1)).
                saveScadFiles();
    }
}

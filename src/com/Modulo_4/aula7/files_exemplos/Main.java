package com.Modulo_4.aula7.files_exemplos;

import java.io.File;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import  java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File filesExamplesIml = new File("./AdaMeli.iml");
        System.out.println(filesExamplesIml.getAbsoluteFile());
        System.out.println(filesExamplesIml.getPath());
        var content = Files.readString(Paths.get("./AdaMeli.iml"));
        System.out.println(content);

        Files.delete(Paths.get("./aula1.txt"));

        var file = Files.createFile(Paths.get("./aula1.txt"));

        Files.writeString(file, "Renato");



    }
}

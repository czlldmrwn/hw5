/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mirea.kt.hw5;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author НР
 */
public class Hw5 {

    public static void main(String[] args) {
        System.out.println("Вариант 5, РИБО-04-21, Волженская Полина Александровна");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите путь к директории: ");
        String path = scan.nextLine();
        File dir = new File(path);
        List<File> files = new ArrayList<>();
        for (File file: dir.listFiles()) {
            if (dir.exists()) {
                files.add(file);
            }
            else {
                System.out.println("Директории по заданному пути не существует!");
            }
        }
        Collections.sort(files);
        List<File> innerFiles = new ArrayList<>();
        for (File file: files){
            if (file.isFile()) {
                System.out.println(file.getPath() + " " + file.length() + " байт");
            }
            else {
                System.out.println(file.getPath() + " папка");
                for (File innerFile: file.listFiles()) {
                    innerFiles.add(innerFile);
            }
                Collections.sort(innerFiles);
                 for (File inFile: innerFiles) {
                    if (inFile.isFile()) {
                        System.out.println(inFile.getPath() + " " + inFile.length() + " байт");
                    }
                    else {
                        System.out.println(inFile.getPath() + " папка");
                    }
                 }
            }
    }
}
}

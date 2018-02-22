package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/* 
Что внутри папки?
*/
public class Solution {

    static long countFails = 0;
  static   long countFolder =0;
  static   long totolSize = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Path pathFile = Paths.get(reader.readLine());
        reader.close();

if (!Files.isDirectory(pathFile)){
    System.out.println(pathFile. toAbsolutePath() + " - не папка");
    return;
}



else {
    Files.walkFileTree(pathFile, new FileVisitor<Path>() {
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            countFails++;
            totolSize = totolSize+attrs.size();

            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
           countFolder++;
            return  FileVisitResult.CONTINUE;
           }
    });
}
        System.out.println("Всего папок - " + (countFolder-1));
        System.out.println("Всего файлов - " + countFails);
        System.out.println("Общий размер - " + totolSize );

    }

}


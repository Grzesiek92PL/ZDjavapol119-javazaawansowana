package com.sda.io_nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PathExample {

    public static void main(String[] args) throws IOException {

        Path rootPath = Paths.get("D:\\Dev\\SDA\\ZDjavapol119-java-zaawansowana\\src\\com\\sda\\io_nio");

        System.out.println(rootPath.getFileName());
        System.out.println(rootPath.getParent());
        System.out.println(rootPath.toAbsolutePath());
        System.out.println(rootPath.getFileSystem());

        System.out.println(" ");

        Path newFile = Paths.get(rootPath.toAbsolutePath().toString() + "\\new_file.txt");
        System.out.println(newFile.toAbsolutePath());

        Files.createFile(newFile);
        Files.write(newFile, "A long time ago in a galaxy far, far away....".getBytes(), StandardOpenOption.WRITE);
        Files.write(newFile, "in a galaxy far, ".getBytes(), StandardOpenOption.APPEND);
        Files.write(newFile, "far away....\n".getBytes(), StandardOpenOption.APPEND);

        for (String line : Files.readAllLines(newFile)) {
            System.out.println(line);
        }

        File myFile = new File(newFile.toUri());

        System.out.println(newFile.toUri());

        Files.delete(newFile);

        Path part = Path.of(rootPath.toAbsolutePath().toString(), "dir_a", "dir_b");


        System.out.println(part.toAbsolutePath());
        Files.createDirectories(part);
    }
}

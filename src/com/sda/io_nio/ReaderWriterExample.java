package com.sda.io_nio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class ReaderWriterExample {


    public static void main(String[] args) throws IOException {

        FileReader in = new FileReader("src\\com\\sda\\io_nio\\someText.txt");
        FileWriter out = new FileWriter("src\\com\\sda\\io_nio\\output_file.txt");

        int nextChar;
        while ((nextChar = in.read()) != -1) {
            out.append((char) nextChar);
        }

        out.flush();
    }
}

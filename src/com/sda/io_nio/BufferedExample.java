package com.sda.io_nio;

import java.io.*;

public class BufferedExample {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("src\\com\\sda\\io_nio\\someText.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("src\\com\\sda\\io_nio\\output_file.txt"));

        String line;
        System.out.println(in.readLine());
        while ((line = in.readLine()) != null) {
            System.out.println(line);
            out.write(line);
            out.newLine();
        }

        out.flush();
    }
}

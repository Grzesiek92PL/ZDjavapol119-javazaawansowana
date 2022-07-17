package com.sda.io_nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {

    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        {
            try {

                in = new FileInputStream("src\\com\\sda\\io_nio\\someText.txt");
                out = new FileOutputStream("src\\com\\sda\\io_nio\\output_file.txt");
                int c;
                while ((c = in.read()) != -1) {
                    out.write(c);
                }
            } finally {

                if (in != null) {
                    in.close();
                }

                if (out != null) {
                    out.close();
                }
            }
        }
    }
}

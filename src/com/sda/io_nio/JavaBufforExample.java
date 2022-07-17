package com.sda.io_nio;

import java.io.CharArrayReader;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.Arrays;

public class JavaBufforExample {

    public static void main(String[] args) {

        CharBuffer buffer = CharBuffer.allocate(8);
        String text = "sda";
        System.out.println("Input text: " + text);

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            buffer.put(c);
        }

        System.out.println("Position after data is written into buffer: " + Arrays.toString(buffer.array()));

    }
}

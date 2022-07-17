package com.sda.io_nio;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Book book1 = new Book(1, "Some Title", "Some Author");
        Book book2 = new Book(2, "Some Title", "Some Author");

        //Utworzenie obiektu reprezentujacego plik
        Path path = Paths.get("D:\\Dev\\SDA\\ZDjavapol119-java-zaawansowana\\src\\com\\sda\\io_nio\\object_output.txt");
        File file = new File(path.toUri());

        //Serializacja
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //W przypadku potrzeby bufforu
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
        //Wypelnianie buffora
        objectOutputStream.writeObject(book1);
        objectOutputStream.writeObject(book2);
        //Oproznienie zawartosci buffora
        objectOutputStream.flush();
        //Zamkniecie strumienia
        objectOutputStream.close();

        //Deserializacja
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);

        //Odczyt
        Object obj1 = objectInputStream.readObject();
        Object obj2 = objectInputStream.readObject();
        System.out.println(obj1);
        System.out.println(obj2);







    }
}

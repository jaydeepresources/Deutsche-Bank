package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIORunner {
    public static void main(String[] args) throws Exception {
        System.out.println("Reading using FileReader");
        FileReader fileReader = new FileReader("/Users/administrator/Desktop/files/demo.txt");
        int data1 = 0;
        while ((data1 = fileReader.read()) != -1) {
            System.out.print((char)data1);
        }

        fileReader.close();

        System.out.println("Reading using FileInputStream");
        FileInputStream fileInputStream = new FileInputStream("/Users/administrator/Desktop/files/demo.txt");
        int data2 = 0;
        while ((data2 = fileInputStream.read()) != -1) {
            System.out.print((char)data2);
        }

        fileInputStream.close();

        System.out.println("Writing using FileWriter");
        FileWriter fileWriter = new FileWriter("/Users/administrator/Desktop/files/out1.txt");
        String msg1 = "This is an output message";
        fileWriter.write(msg1);
        System.out.println("Writing using FileWriter is complete");
        fileWriter.close();

        System.out.println("Writing using FileOutputStream");
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/administrator/Desktop/files/out2.txt");
        String msg2 = "This is an output message";
        fileOutputStream.write(msg2.getBytes());
        System.out.println("Writing using FileOutputStream is complete");
        fileOutputStream.close();

    }
}

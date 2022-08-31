package com.epam.mjc.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {


        StringBuilder str = new StringBuilder();

        try {

            BufferedReader my_Reader = new BufferedReader(new java.io.FileReader(new File("src/main/resources/Profile.txt")));
            String line = "";

            while ((line = my_Reader.readLine()) != null) {
                str.append(line+" ");
            }

            my_Reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not exists or insufficient rights");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An exception occured while reading the file");
            e.printStackTrace();
        }
        String singleString = str.toString();

        String[] parts = singleString.split("\n");

        String[] pa = parts[0].split(" ");
        Profile p = new Profile(pa[1], Integer.parseInt(pa[3]), pa[5], Long.parseLong(pa[7]));
        return p;
    }
}

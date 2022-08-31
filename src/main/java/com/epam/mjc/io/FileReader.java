package com.epam.mjc.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {


        StringBuilder str = new StringBuilder();

        try {

            BufferedReader my_Reader = new BufferedReader(new java.io.FileReader(file));
            String line = "";

            while ((line = my_Reader.readLine()) != null) {
                str.append(line + "\n");
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

        String[] parts0 = parts[0].split(": ");
        String[] parts1 = parts[1].split(": ");
        String[] parts2 = parts[2].split(": ");
        String[] parts3 = parts[3].split(": ");

        Profile p = new Profile(parts0[1], Integer.parseInt(parts1[1]), parts2[1], Long.parseLong(parts3[1]));

        return p;
    }
}

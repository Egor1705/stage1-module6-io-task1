package com.epam.mjc.io;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;

import java.io.File;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub


		File file = new File("src/main/resources/Profile.txt");

		FileReader f = new FileReader();
		f.getDataFromFile(file);

	     //   File file = new File("src/main/resources/Profile.txt");
	     
	}
	
	 
}


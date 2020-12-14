package com.practice.base;

import java.awt.image.FilteredImageSource;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
	public static void main(String [] args) {
		
		int x = 10;
		
	}
		
		public void readFile(int year) throws FileNotFoundException {
		String fname = "data/yob " + year + ".txt";
		FileReader fr = new FileReader(fname);
		System.out.println(fr);
	}

}


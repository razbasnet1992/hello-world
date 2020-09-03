package com.practice.base;

import java.awt.image.FilteredImageSource;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
	public static void main(String [] args) {
		
		
		
	}
		
		public void readFile(int year) throws FileNotFoundException {
		String fname = "data/yob " + year + ".txt";
		FileReader fr = new FileReader(fname);
	}

}


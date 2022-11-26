package com.bhavna.service;


import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

import com.bhavna.bean.TextFile;

public class TextFileReader {
	Map<String, ArrayList<TextFile>> mapValues = new HashMap<String, ArrayList<TextFile>>();

	public void developMap(String name, TextFile userData) {
		if (mapValues.containsKey(name)) {
			mapValues.get(name).add(userData);
		} else {
			mapValues.put(name, new ArrayList<TextFile>());
			mapValues.get(name).add(userData);
		}
	}

	public void display() {
		mapValues.forEach((key, values) -> System.out.println(key + " : " + values));
	}

	public void readFile() {
		try {
			int flag = 0;
			File file = new File("C:\\temp\\a.txt");

			// BufferedReader br= new BufferedReader(new FileReader(file));
			Scanner read = new Scanner(file);
			String st;

			while (read.hasNextLine()) {

				String data = read.nextLine();

				String[] array = data.split("\t");
				
                if (array.length>3) {
                	System.out.println("Failure, not in correct format");
                	continue;
                }
				TextFile textData = new TextFile(array[0], array[1], array[2]);
				TextFileReader readerOb = new TextFileReader();
				readerOb.developMap(textData.getName(), textData);
				readerOb.display();

			}
		} catch (IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}

	}
}

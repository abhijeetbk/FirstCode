package com.FileReaderTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FIleReadProgram {

	static List<String> content = new ArrayList<>();

	public static void main(String[] args) {
		File file = new File("reader.txt");

//		try {
//			FileWriter writer = new FileWriter (new File("reader.txt"));
//			writer.write("Hello");
//			writer.close();
//			
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		try {
			
			
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				addSong(scanner.nextLine());
			}
			scanner.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		content.forEach(System.out::println);


	}

	private static void addSong(String nextLine) {
		String[] tokens = nextLine.split("/");
		for (String token : tokens) {
			content.add(token);
		}

	}

}

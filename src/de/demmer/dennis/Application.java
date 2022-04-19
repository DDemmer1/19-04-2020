package de.demmer.dennis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	
		while (true) {

			String line = scanner.next();
			line = line.toLowerCase();
			
			
			switch (line) {

			case "time": {
				Application.showTime();
				break;
			}
			case "exit": {
				System.exit(0);
				break;
			}
			default:
				System.out.println("Command not found");
			}

		}

	}
	
	
	public static void showTime() {
		System.out.println(new Date().toLocaleString());
	}

}

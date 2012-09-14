package org.ventt.java1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int x1, y1, x2, y2;
		String line;
		String spont[];

		Scanner scn = new Scanner(System.in);

		System.out.println("Írd be az első pont koordinátáit!");
		line = scn.nextLine();
		spont = line.split(",");

		x1 = Integer.parseInt(spont[0]);
		y1 = Integer.parseInt(spont[1]);

		System.out.println("Írd be második pont koordinátáit!");
		line = scn.nextLine();
		spont = line.split(",");

		x2 = Integer.parseInt(spont[0]);
		y2 = Integer.parseInt(spont[1]);

		System.out.println(Math.sqrt(Math.pow(x1 + x2, 2) + Math.pow(y1 + y2, 2)));

	}

}

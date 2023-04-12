package com.Mavan_Project;

import java.io.IOException;

public class ddmuldata extends Baseclass{

	public static void main(String[] args) throws IOException {
		
		createexcelsheet(0, 0, "selenium");
		createcell(0, 1, "java");
		createcell(0, 2, "Data Driven");
		createcell(0, 3, "POM");
		
		createrow(1, 0, "Appium");
		createcell(1, 1, "Cucumber");
		createcell(1, 2, "Junit");
		createcell(1, 3, "TestNG");
		

	}

}

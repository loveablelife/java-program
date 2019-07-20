package com.array.redington;

import java.util.Scanner;

public class ReplaceArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("	REPLACE THE NUMBER");
		System.out.println("	==================");
		ReplaceArray ra=new ReplaceArray();
		ra.getInput();
		ra.findNumber();
		ra.replacement();
	}

}

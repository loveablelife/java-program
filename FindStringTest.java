package com.Redington.classTest;

import java.util.Scanner;

public class FindStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindString fs=new FindString();
		Scanner scan=new Scanner(System.in);
		System.out.println("		To Change the upper case to lower case");
		System.out.println("		**************************************");
		fs.getInput();
		fs.mainFun();
		fs.lower();
	}

}

package com.array.redington;
import java.util.Scanner;
public class FactorialArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("       +++++++++++++++++++++");
		System.out.println("       FIND FACTORIAL NUMBER");
		System.out.println("       +++++++++++++++++++++");
		FactorialArray fa=new FactorialArray();
		fa.getInput();
		fa.factNumber();
	}

}

package com.harshal.tradeshift.triangle;

import java.util.Scanner;

public class TriangleApp {
	public static void main(String[] args){
		Triangle t = new Triangle();
	    int i = 0;

	    /**
	     * sets all the sides of triangle
	     */
	    while(i != t.getNumberOfSides())
	    {
			try {
				t.setSide(readInt("Please enter length of side "+(i+1)));
				i++;
			} catch (Exception e) {
				System.out.println("Please enter positive length");
				continue;
			}
		}

	    /**
	     * gets the Type of triangle
	     */
	    try {
			System.out.println(t.getType());
		} catch (Exception e) {
			System.out.println("This is not a Valid Triangle");
		}
	}
	
	/**
	 * Takes valid input from the user and returns length of triangle  
	 * @param msg
	 * @return length
	 */
	public static int readInt(String msg){
		int length = 0;
	    Scanner scanner = new Scanner(System.in);
	    System.out.println(msg);
	    try {
	    	length = scanner.nextInt();
	    } catch (Exception e) {
	    	length = readInt(msg);
	    }
	    scanner.close();
		return length;
	}
}

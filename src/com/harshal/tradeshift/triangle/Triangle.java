package com.harshal.tradeshift.triangle;

public class Triangle {
	private int[] sides;
	private int totalSides;
	
	private static int MAX_SIDES = 3;
	
	public Triangle() {
		sides = new int[3];
		totalSides = 0;
	}
	
	/**
	 * 
	 * @param length
	 * @throws Exception 
	 */
	public void setSide(int length) throws Exception{
		if(length > 0) {
			sides[totalSides++] = length;
		} else {
			throw new Exception("Invalid length");
		}
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception 
	 */
	public String getType() throws Exception{
		if(!isValid()){
			throw new Exception("Invalid Triangle");
		}
		if(isEquilateral()) {
			return "EQUILATERAL";
		} else if(isIsosceles()) {
			return "ISOSCELES";
		} else {
			return "SCALENE";
		}
	}
	
	/**
	 * get the Max Number of Sides
	 * @return
	 */
	public int getNumberOfSides(){
		return  MAX_SIDES;
	}
	
	/**
	 * Validates the triangle
	 * @return
	 */
	private boolean isValid(){
		return (totalSides == MAX_SIDES 
				&&
				 (sides[0] + sides[1] > sides[2]
			&& sides[1] + sides[2] > sides[0]
			&& sides[2] + sides[0] > sides[1])); 
	}
	
	private boolean isEquilateral(){
		return (sides[0] == sides[1] && sides[1] == sides[2]);
	}
	
	private boolean isIsosceles(){
		return (sides[0] == sides[1] 
				|| sides[1] == sides[2]
				|| sides[0] == sides[2]);
	}
	
}

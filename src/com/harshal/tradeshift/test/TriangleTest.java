package com.harshal.tradeshift.test;

import static org.junit.Assert.assertEquals;

import com.harshal.tradeshift.triangle.Triangle;

import org.junit.Before;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
 
@RunWith(Theories.class)
public class TriangleTest {
	
	Triangle t;
	
	@Before
	public void setup(){
		t = new Triangle();
	}
 
    @DataPoints("isoscelesSides")
    public static int[][] isoscelesSides() {
        // Use new Random().nextInt() to experiment:
        int[][] ints = {{1,1,3}, {3,3,2}, {12,12,14}};
        return ints;
    }
    
    @Theory
	public void testIsocalane(@FromDataPoints("isoscelesSides") int[] sides) {
		try{
			t.setSide(sides[0]);
			t.setSide(sides[1]);
			t.setSide(sides[2]);
		} catch (Exception e) {
		}
		
		try{
			String type = t.getType();
			assertEquals("ISOSCELES", type);
		} catch (Exception e){
			
		}
	}
    
    @DataPoints("equilateralSides")
    public static int[][] equilateralSides() {
        // Use new Random().nextInt() to experiment:
        int[][] ints = {{1,1,1}, {3,3,3}, {12,12,12}};
        return ints;
    }
    
    @Theory
	public void testEquilateral(@FromDataPoints("equilateralSides") int[] sides) {
		try{
			t.setSide(sides[0]);
			t.setSide(sides[1]);
			t.setSide(sides[2]);
		} catch (Exception e) {
		}
		
		try{
			String type = t.getType();
			assertEquals("EQUILATERAL", type);
		} catch (Exception e){
			
		}
	}
    
    @DataPoints("scaleneSides")
    public static int[][] scaleneSides() {
        // Use new Random().nextInt() to experiment:
        int[][] ints = {{1,2,3}, {5,3,2}, {15,12,14}};
        return ints;
    }
    
    @Theory
	public void testScalene(@FromDataPoints("scaleneSides") int[] sides) {
		try{
			t.setSide(sides[0]);
			t.setSide(sides[1]);
			t.setSide(sides[2]);
		} catch (Exception e) {
		}
		
		try{
			String type = t.getType();
			assertEquals("SCALENE", type);
		} catch (Exception e){
			
		}
	}

}
package com.sort.tests;

import org.junit.Test;
import org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.matchers.*;

public class arrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayCopy arrayCopy1 = new arrayCopy();
		arrayCopy1.arraycopy();

	}
	@Test
	public  void arraycopy(){
		int[] integer = {1,2,4,3,8,7};
		int[] newinteger = new int[integer.length+1];
		System.arraycopy(integer, 0, newinteger, 0, integer.length);
		integer = newinteger;
		integer[6]=6;
		
		assertEquals(6 , integer[6]) ;
		
	}

}

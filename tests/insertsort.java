package com.sort.tests;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class insertsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final  List<Integer> listtobesorted = Arrays.asList(8,3,4,1,2,5,9);
		sortByInsert(listtobesorted);
		

	}

	/**
	 * 
	 */
	
	public static List<Integer> sortByInsert(List<Integer> listtobesorted){
		final  List<Integer> newlisttobesorted = new LinkedList<>();
		
		for (Integer  listtosort:listtobesorted  ){
			for (int i =0 ; i<newlisttobesorted.size();i++ )
		   if (listtosort < newlisttobesorted.get(i)){
			   
		   }
			   
		
		}
		return newlisttobesorted;
	
	}
}

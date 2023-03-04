package com.AllShows;

import java.util.ArrayList;
import java.util.List;

public class SeatList {
	
	
	public static void main(String[] args) {
		
	
	List<String> platinum= new ArrayList<String>();
	platinum.add("A1");
	platinum.add("A2");
	platinum.add("A3");
	platinum.add("A4");
	platinum.add("A5");
	platinum.add("A6");
	platinum.add("A7");
	platinum.add("A8");
	platinum.add("A9");
	
	
	List<String> gold= new ArrayList<String>();
	     gold.add("B1");
	     gold.add("B2");
	     gold.add("B3");
	     gold.add("B4");
	     gold.add("B5");
	     
	     
	     List<String> silver= new ArrayList<String>();
	     silver.add("C1");
	     silver.add("C2");
	     silver.add("C3");
	     silver.add("C4");
	     silver.add("C5");
	     
	     
	     
	     List<List<String>> allList1= new ArrayList<List<String>>();
	         allList1.add(platinum);
	         allList1.add(gold);
	         allList1.add(silver);
	         
	        
	          
	     
	}
}

package com.AllShows;

import java.security.AllPermission;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingServiceTicket {
	
	static int CgstInPercent= 9;
	static int  SgstInPercent= 9;
	static int A=320;
	static int B=280;
	static int C=240;
	
	public static void main(String[] args) {
		 
		System.out.println("=====Welcome To ABC Theatre=====");
		
		
		System.out.println("Enter Your Choise:\n" + "Press 1 For Show 1\n"+ "Press 2 For Show 2 \n" + "Press 3 For Show 3");
		Scanner sc= new Scanner(System.in);
	          int x=sc.nextInt();
	          
	          
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
		         
		         List<List<String>> allList2= new ArrayList<List<String>>();
			     allList2.add(platinum);
			     allList2.add(gold);
			     allList2.add(silver);
			     
			     List<List<String>> allList3= new ArrayList<List<String>>();
			     allList3.add(platinum);
			     allList3.add(gold);
			     allList3.add(silver);
	          
			     switch (x) {
				case 1:
					
					 System.out.println(allList1);
		        	  int z= A + (A/100)*CgstInPercent+(A/100)*SgstInPercent;
		        	  int y= B + (B/100)*CgstInPercent+(B/100)*SgstInPercent;
		        	  int w= C + (C/100)*CgstInPercent+(C/100)*SgstInPercent;
		        	  
		        	  int total= z+y+w;
			        	 
			        	 
		        	  System.out.println("Select the Seat Which You want to select");
		        	  Scanner sc1= new Scanner(System.in);
		      	    String seats= sc1.nextLine();
		      	     
		           	
		           //	  for(seat:	seats.split(" ") )
		      	    
		           	
		           String [] array= seats.split(" "); //split method is used to iterate that line 
		                for( String arr: array)
		                { 
		                	System.out.println(arr);
		                	
		                }
		           
		      	    System.out.println(seats);
		      	  
		        	  System.out.println("Total Cost For Ticket is " + seats +" is:" + total );
//		        	  System.out.println("Total Cost For Gold Ticket is " +seats +" is:" + total ); 
//		        	  System.out.println("Total Cost For Silver Ticket is " +seats +" is:" + total); 
//			        	  
					break;
					
					

				case 2: 
					 System.out.println(allList2);
		        	  int z1= A + (A/100)*CgstInPercent+(A/100)*SgstInPercent;
		        	  int y1= B + (B/100)*CgstInPercent+(B/100)*SgstInPercent;
		        	  int w1= C + (C/100)*CgstInPercent+(C/100)*SgstInPercent;
			        	 
		        	  System.out.println("Enter Number of Platinum Tickets");	
		        	  Scanner sc2= new Scanner (System.in);
		      	    int no= sc2.nextInt();
		      	  System.out.println("Enter Number of Gold Tickets");
		      	   
		      	  System.out.println("Enter Number of Silver Tickets");
		      	  
		      	  
		        	  System.out.println("Total Cost For Platinum Ticket is " +no*z1 );
		        	  System.out.println("Total Cost For Gold Ticket is " +no*y1 ); 
		        	  System.out.println("Total Cost For Silver Ticket is " +no*w1 ); 
		        	  
		        	  break;
		        	  
		        	  
				case 3:
			
	        	  System.out.println(allList3);
	        	  int z2= A + (A/100)*CgstInPercent+(A/100)*SgstInPercent;
	        	  int y2= B + (B/100)*CgstInPercent+(B/100)*SgstInPercent;
	        	  int w2= C + (C/100)*CgstInPercent+(C/100)*SgstInPercent;
		        	 
	        	  System.out.println("Enter Number Platinum of Tickets");
	        	  Scanner sc3= new Scanner(System.in);
	      	    int no1= sc3.nextInt();
	      	    
	      	  System.out.println("Enter Number of Gold Tickets");
        	
	      	    int no2=sc3.nextInt();
	      	    
	      	  System.out.println("Enter Number of Silver Tickets");
        	
	      	    int no3=sc3.nextInt();
	      	  
	      	       
	        	  
	        	  System.out.println("Total Cost For Platinum Ticket is " +no1*z2 );
	        	  System.out.println("Total Cost For Gold Ticket is " +no2*y2 ); 
	        	  System.out.println("Total Cost For Silver Ticket is " +no3*w2 ); 
	          }
	          
	          
	  
      	  System.out.println("Would You like to Continue For Payment");
	
	}

}

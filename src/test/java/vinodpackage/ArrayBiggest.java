package vinodpackage;

import java.util.Scanner;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.Alert;

public class ArrayBiggest {

	public static void main(String[] args) {

		  
	           Scanner sc=new Scanner(System.in);
	         System.out.println("enter the size on an arrau");
	           int n= sc.nextInt();
	           System.out.println("enter the array elements");
	          int ar[]=new int[n];
			 
	            
	          for(int i=0;i<ar.length;i++)
	          {
	        	  ar[i]=sc.nextInt();
	          }
	      
	          
	          
	          
	          
	
	         getBig(ar);
	
	}

	private  static void  getBig(int[] ar) {

		   int big=ar[0]; int sbig=ar[1];
		   
		   for(int i=0;i<ar.length;i++)
		   {
			   
			   if(big<ar[i])
			   {
				   sbig=big;
				   big=ar[i];
			   }
			   else 
			   {
				   sbig=ar[i];
			   }
			   
		   }
		     System.out.println(big);
		     System.out.println(sbig);
		     
		
	}

}

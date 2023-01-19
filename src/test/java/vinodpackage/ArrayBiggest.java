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
	      
	          
	          
	          for(int i=0;i<ar.length;i++)
	          {
	        	 System.out.println(ar[i]);
	          }
	     
	
	         int  b= getBig(ar);
	     System.out.println(b);
	
	}

	private  static int  getBig(int[] ar) {

		   int big=ar[0];
		   
		   for(int i=0;i<ar.length;i++)
		   {
			   
			   if(ar[0]>ar[i])
			   {
				   big=ar[i];
			   }
			   
		   }
		   
		
		return big;
	}

}

package com.sample.converttonumbers;

import java.util.Scanner;

public class WordConvertion {
	public static void main(String[] args) {

		  int count=0;
		  Scanner in =new Scanner(System.in);
		  System.out.println("Enter number to be converted:");
		  int num= in.nextInt();
		  try{
			  
			  System.out.println("number is :"+num);
			  
			  int numArr[]=new int[50];
			  while(num != 0)
			    {
				  numArr[count]=num%10;
				  num /= 10;
			        ++count;
			    }
			  System.out.println("its a "+count+" digit number");
			  
			CommonMethods commonMethods = new CommonMethods();
			System.out.println(commonMethods.numToWord(count,numArr));
			  
		  }catch (NumberFormatException e) {
			e.printStackTrace();
		  }
		  
		  
	}

}

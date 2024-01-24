package Array;

import java.util.Arrays;

public class aaa {

	 public static void main(String[] args)
	    {
		 
		 int arr[]= {1,4,20,3,10,5};
		 int sum=33;
		 int n=arr.length;
		
		 for (int i=0;i<n;i++)
		 {
			 if(arr[i]==sum)
			 {
				 System.out.println(i +" is the index");
			 }
			 int total=arr[i];
			 
			 for (int j=i+1;j<n;j++)
			 {
				 total=total+arr[j];
				 
				 if (total ==sum)
				 {
					 System.out.println(i+" to "+j);
				 }
				 else if(total >sum)
				 {
					 break;
				 }
				 
			 }
			 
		 }
		 
		 
		
		 
		 
}}























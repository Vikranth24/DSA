package Array;

import java.util.Arrays;

public class aaa {

static void getCumulativeSum (int[] arr) {
		
		int n=arr.length;
		int temp=arr[0];
		for (int i=1;i<n;i++)
		{
			temp=temp+arr[i];
			arr[i]=temp;
			
			
		}
		
		for (int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		
	}
	
	public static void main(String[] args)
	{
		int arr1[]={1,2,3,6};
		int arr2[]={1,1,1,1,1};
		int arr3[]={1,3,5,7,9};
		 getCumulativeSum(arr1);
		 getCumulativeSum(arr2);
		 getCumulativeSum(arr3);
		 
		
		

		
	
		 
		 
}
	}























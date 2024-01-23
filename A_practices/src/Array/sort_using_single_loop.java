package Array;

import java.util.Arrays;

//Input : arr[] = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
//Output : 1 2 3 4 5 6 7 8 9 10 


//used to sort the array starts from 1


public class sort_using_single_loop {

	public static void main(String[] args) {
		int []arr={10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
		int n=arr.length;
		int i=0;
		
		while(i<n)
		{
			int sort=arr[i]-1;
			
			
			if (arr[sort]!=arr[i])
			{
				int temp =arr[sort];
				arr[sort]=arr[i];
				arr[i]=temp;
			}
			else
			{
				i++;
			}
			
			
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}

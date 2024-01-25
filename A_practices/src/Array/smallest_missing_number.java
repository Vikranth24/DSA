package Array;
/*Given a sorted array of n distinct integers where each integer is in the range from 0 to m-1 and m > n. Find the smallest number that is missing from the array. 

Examples:

Input: {0, 1, 2, 6, 9}, n = 5, m = 10 
Output: 3

Input: {4, 5, 10, 11}, n = 4, m = 12 
Output: 0

Input: {0, 1, 2, 3}, n = 4, m = 5 
Output: 4

Input: {0, 1, 2, 3, 4, 5, 6, 7, 10}, n = 9, m = 11 
Output: 8*/

public class smallest_missing_number {

	public static void main(String[] args) {
		int arr[]= {0, 1, 2, 6, 9};
		int n=5;
		int m=10;
		
		
		for (int i=0;i<n;i++)
		{
			if(arr[i]!=i)
			{
				System.out.println(i);
				break;
			}
		}
		
		
	}

}

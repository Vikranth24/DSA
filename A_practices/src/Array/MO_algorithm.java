package Array;
/*
 Let us consider the following problem to understand MO’s Algorithm.
We are given an array and a set of query ranges, we are required to find the sum of every query range.

Example: 

Input:  arr[]   = {1, 1, 2, 1, 3, 4, 5, 2, 8};
        query[] = [0, 4], [1, 3] [2, 4]
Output: Sum of arr[] elements in range [0, 4] is 8
        Sum of arr[] elements in range [1, 3] is 4  
        Sum of arr[] elements in range [2, 4] is 6
 */
public class MO_algorithm {

	public static void main(String[] args) {
		int arr[]= {1, 1, 2, 1, 3, 4, 5, 2, 8};
		int n=arr.length;
		System.out.println(find(arr,n,0,4)+" is the sum");
		System.out.println( find(arr,n,1,3)+" is the sum");
		System.out.println(find(arr,n,2,4)+" is the sum");
	}
	public static int find(int[] arr, int n, int start, int end)
	{
		int total=0;
		for (int i=start;i<=end;i++)
		{
		total =total+arr[i];
		
		}
		return total;
		
		
		
	}

}

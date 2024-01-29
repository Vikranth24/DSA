package Array;
/*
 Inversion Count for an array indicates – how far (or close) the array is from being sorted. If the array is already sorted, then the inversion count is 0, but if the array is sorted in reverse order, the inversion count is the maximum. 

Given an array arr[]. The task is to find the inversion count of arr[]. Where two elements arr[i] and arr[j] form an inversion if a[i] > a[j] and i < j.

Examples: 

Input: arr[] = {8, 4, 2, 1}
Output: 6
Explanation: Given array has six inversions: (8, 4), (4, 2), (8, 2), (8, 1), (4, 1), (2, 1).
 */
public class Inversion_count_in_array_using_merge_sort {

	public static void main(String[] args) {
		int arr[]= {1, 20, 6, 4, 5};
		int n=arr.length;
		int count=0;
		
		for (int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if (arr[i]>arr[j])
				{
					count++;
				}
			}
		}
		

		System.out.println(count);
	}

}

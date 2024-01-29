package Array;
/*
 We are given two sorted arrays. We need to merge these two arrays such that the initial numbers (after complete sorting) are in the first array and the remaining numbers are in the second array

Examples: 

Input: ar1[] = {10}, ar2[] = {2, 3}
Output: ar1[] = {2}, ar2[] = {3, 10}  

Input: ar1[] = {1, 5, 9, 10, 15, 20}, ar2[] = {2, 3, 8, 13}
Output: ar1[] = {1, 2, 3, 5, 8, 9}, ar2[] = {10, 13, 15, 20}
 */
public class Merge_two_sorted_array {

	public static void main(String[] args) {
		int arr1[]= {1, 5, 9, 10, 15, 20};
		int arr2[]= {2, 3, 8, 13};
		int m=arr1.length;
		int n=arr2.length;
		
		
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++) {
				if(arr1[i]>arr2[j])
				{
					int temp=arr1[i];
					arr1[i]=arr2[j];
					arr2[j]=temp;
					
				}
				
			}
			
		}
		
		
		for (int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if (arr2[i]>arr2[j])
				{
					int temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
			
		}
		
		for (int a:arr1)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		for (int a:arr2)
		{
			System.out.print(a+" ");
		}
		
		

	}

}

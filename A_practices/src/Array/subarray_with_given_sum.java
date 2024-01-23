package Array;
/*Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.

Note: There may be more than one subarray with sum as the given sum, print first such subarray. 

Examples: 

Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33*/



public class subarray_with_given_sum {
	

	public static void main(String[] args) {
		int arr[]= {1, 4, 20, 3, 10, 5};
		int sum=33;
		
		int n=arr.length;
		
		for (int i=0;i<n;i++)
		{
			int total=arr[i];
			for (int j=i+1;j<n;j++)
			{
				total=total+arr[j];
				if(total>sum)
				{
					break;
				}
				else if(total ==sum)
				{
					System.out.println(i+" to "+ j);
				}
			}
		}
		

	}

}

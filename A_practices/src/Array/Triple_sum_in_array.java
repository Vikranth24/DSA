package Array;
/*
 Given an array arr[] of size n and an integer X. Find if there’s a triplet in the array which sums up to the given integer X.

Examples: 

Input: array = {12, 3, 4, 1, 6, 9}, sum = 24; 
Output: 12, 3, 9 
Explanation: There is a triplet (12, 3 and 9) present 
in the array whose sum is 24. 

Input: array = {1, 2, 3, 4, 5}, sum = 9 
Output: 5, 3, 1 
Explanation: There is a triplet (5, 3 and 1) present 
in the array whose sum is 9.
 */
public class Triple_sum_in_array {

	public static void main(String[] args) {
		
		int arr[]={1, 2, 3, 4, 5};
		int sum=9;
		int n=arr.length;
		int count =0;
		for (int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				for (int k=j+1;k<n;k++)
				{
					if (arr[i]+arr[j]+arr[k]==sum)
					{
						System.out.println(arr[i]+", "+arr[j]+", "+arr[k]);
						count =1;
						break;
					}
				}
				if (count==1)
				{
					break;
				}
			}
			if (count==1)
			{
				break;
			}
		}
		if (count ==0)
		{
			System.out.println("no match fount");
		}
	}

}

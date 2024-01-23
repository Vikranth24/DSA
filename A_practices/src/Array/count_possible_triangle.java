package Array;

import java.util.Arrays;

/*input: arr= {4, 6, 3, 7}
Output: 3
Explanation: There are three triangles 
possible {3, 4, 6}, {4, 6, 7} and {3, 6, 7}. 
Note that {3, 4, 7} is not a possible triangle.  

Input: arr= {10, 21, 22, 100, 101, 200, 300}.
Output: 6
Explanation: There can be 6 possible triangles:
{10, 21, 22}, {21, 100, 101}, {22, 100, 101}, 
{10, 100, 101}, {100, 101, 200} and {101, 200, 300}*/


public class count_possible_triangle {

	public static void main(String[] args) {
		
		int arr[]={10, 21, 22, 100, 101, 200, 300};
		int n=arr.length;
		int count=0;
		Arrays.sort(arr);
		
		for (int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if( arr[i]+arr[j]>arr[k])
					{
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}

package Array;
/*Write a program to print all the LEADERS in the array. An element is a leader if it is greater than all the elements to its right side. And the rightmost element is always a leader. 

For example:

Input: arr[] = {16, 17, 4, 3, 5, 2}, 
Output: 17, 5, 2

Input: arr[] = {1, 2, 3, 4, 5, 2}, 
Output: 5, 2*/
public class Leader_in_array {

	public static void main(String[] args) {
		int arr[]={1, 2, 3, 4, 5, 2};
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			if (i==n-1)
			{
				System.out.print(arr[i]);
			}
			for(int j=i+1;j<n;j++)
			{
				if (arr[i]<arr[j])
				{
					break;
				}
				else if(j==n-1)
				{
					System.out.print(arr[i]+" ");
				}
			}
			
			
		}
		

	}

}

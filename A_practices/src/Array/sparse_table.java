package Array;
/*
 Input:  arr[]   = {7, 2, 3, 0, 5, 10, 3, 12, 18};
        query[] = [0, 4], [4, 7], [7, 8]

Output: Minimum of [0, 4] is 0
        Minimum of [4, 7] is 3
        Minimum of [7, 8] is 12
 */
public class sparse_table {

	public static void main(String[] args) {
		int arr[]= {7, 2, 3, 0, 5, 10, 3, 12, 18};
		int n=arr.length;
		System.out.println(find(arr,0,4));
		System.out.println(find(arr,4,7));
		System.out.println(find(arr,7,8));
		

	}
	
	public static int find(int[] arr, int start, int end)
	{
		int min_value=Integer.MAX_VALUE;
		for (int i=start;i<=end;i++)
		{
			if( arr[i]<min_value)
			{
			 min_value=arr[i];
			 
			}
		}
		return min_value;
		
		
	}

}

package Array;

public class print_unique_number_in_array {
/*
 * Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
Output: 12, 10, 9, 2

Input: arr[] = {1, 2, 3, 4, 5}
Output: 1, 2, 3, 4, 5
 * */
 
	public static void main(String[] args) {
		
		int arr[]={12, 10, 9, 45, 2, 10, 10, 45};
		int n=arr.length;
	
		for(int i=0;i<n;i++)
		{
			int j;
			for ( j=0;j<i;j++)
			{
				if( arr[i]==arr[j])
				{
					break;
				}
				
			}
			
			if(i==j)
			{
				System.out.print(arr[i]+" ");
			}
		}
		

	}

}

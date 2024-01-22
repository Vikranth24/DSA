package Array;

public class second_largest_in_array {

	public static void main(String[] args) {
		int arr[]= {3,5,4,2,6,7};
		int n=arr.length;
		int first,second;
		first=second=Integer.MIN_VALUE;
		
		for (int i=0; i<n;i++)
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
				
			}
			
			else if (arr[i]>second)
			{
				second=arr[i];
				
			}
			
		}
		System.out.println(second);
		
		
		
		
	}

}

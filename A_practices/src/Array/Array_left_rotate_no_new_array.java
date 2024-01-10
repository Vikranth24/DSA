package Array;

public class Array_left_rotate_no_new_array {
	
	public static void main (String [] args)
	{
		int arr[]= {1,2,3,4,5};
		int d=2;
		int n=arr.length;
		int p=0;
		
		
		while (p<d)
		{
			int last =arr[0];
			for (int i=0;i<n-1;i++)
			{
				arr[i]=arr[i+1];
				
				
			}
			arr[n-1]=last;
			p++;
			
		}
		
		for (int a:arr)
		{
			System.out.print(a+" ");
		}
		

}
	}

package Array;

public class Array_right_rotate {
	
	public static void main(String [] args)
	{
		int arr[]= {1,2,3,4,5};
		
		int d=2;
		int n=arr.length;
		int temp[]=new int[n];
		int k=0;
		
		for (int i=n-(d);i<n;i++)
		{
			temp[k]=arr[i];
			k++;
		}
		for (int i=0;i<n-d;i++)
		{
			temp[k]=arr[i];
			k++;
		}
		for (int i=0;i<n;i++)
		{
			arr[i]=temp[i];
			
		}
		for (int a:arr)
		{
			System.out.print(a+" ");
		}
		
	}

}

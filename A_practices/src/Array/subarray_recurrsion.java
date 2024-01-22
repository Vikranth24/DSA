package Array;

public class subarray_recurrsion {
	public static void rec(int[] arr, int start, int end) {
		
		if (start > end)
		return;
		
		System.out.print("[ ");
		for (int j= start;j<=end; j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.print("]");
		System.out.println();
		
		rec(arr,start,end-1);
		
		
	}
	
	public static void main(String[] args)
	{
		int arr[]= {0,1,2,3};
		int n=arr.length;
		for (int i=0;i<n;i++)
          rec(arr,i,n-1);
		
	}

}








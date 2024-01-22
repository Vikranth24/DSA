package Array;

public class subarray {
	public static void main(String[] args)
	{
		int[] arr= {1,2,3};
		
		int n=arr.length;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n-i;j++)
			{
				System.out.print("[ ");
				for (int k=i;k<=i+j;k++)
				{
					
					System.out.print(arr[k]+ " ");
				}
				System.out.print("]");
				System.out.println();
			}
		}
		
		}

}

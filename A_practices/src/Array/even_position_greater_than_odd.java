package Array;
//Input : A[] = {1, 2, 2, 1}
//Output :  1 2 1 2

//Input : A[] = {1, 3, 2, 2, 5}
//Output :  1 5 2 3 2 


public class even_position_greater_than_odd {

	public static void main(String[] args) 
	{
	int arr[] = {1, 3, 2, 2, 5};
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
		if (i%2 !=0)
		{
			int pos=i;
			for (int j=i+1;j<n;j++)
			{
				if (arr[j]>arr[pos])
				{
					pos=j;
				}
			}
			int temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
		}
	}
	
	for(int a:arr)
	{
		System.out.print(a+" ");
	}
	
	
	}}
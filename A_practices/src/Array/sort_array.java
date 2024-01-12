package Array;

public class sort_array {
public static void main(String[] args)
{
	int arr[]= {5,9,3,4,1};
	for (int i=0; i<arr.length;i++)
	{
		for (int j=i+1;j<arr.length;j++)
{
	
			if (arr[i]>arr[j])
			{
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				
			}
			
}
		
	}
	for (int a:arr)
	{
		System.out.print(a+" ");
	}
	
}
}

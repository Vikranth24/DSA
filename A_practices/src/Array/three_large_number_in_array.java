package Array;

public class three_large_number_in_array {

	public static void main(String[] args) {
		
	
int [] arr= {10, 4, 3, 50, 23, 90};
int n=arr.length;


for (int i=0;i<n;i++)
{
	int v=0;
	for (int j=0;j<n;j++)
	{
	
		if (arr[i]>arr[j])
		{
			v++;
		}
		
	}
	if(v >=3)
	{
		System.out.println(arr[i]+" ");
	}
	
}

	}

}

package Array;

public class Reorder_according_to_index {

	public static void main(String[] args) {
		int[] arr= {10,11,12};
		int n=arr.length;
		int[] index= {1,0,2};
		int temp[]=new int[n];
		
		for (int i=0;i<n;i++)
	
		{
			temp[index[i]]=arr[i];
		}
		for (int j=0;j<n;j++)
		{
			arr[j]=temp[j];
		}
		
		for (int a:arr)
		{
		System.out.print(a+" ");
		}
		
		
		

	}

}

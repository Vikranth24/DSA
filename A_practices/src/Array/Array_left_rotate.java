package Array;

public class Array_left_rotate {
	 static void rotateArr(int arr[], int d, int n)
	    {
		 int []temp=new int[n];
		 int k=0;
		 for (int i=d;i<n;i++)
		 {
			 temp[k]=arr[i];
			 k++;
			 
		 }
		 
		 for (int i=0;i<d;i++)
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
public static void main(String[] args)
{
	int arr[]= {1,2,3,4,5};
	int d=3;
	int n=arr.length;
	rotateArr(arr,d,n);
}
}

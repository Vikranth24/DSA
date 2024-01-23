package Array;

//Input: arr[] = {1, 2, 3, 4, 5, 6, 7} 
//Output: arr[] = {7, 1, 6, 2, 5, 3, 4}

//Input: arr[] = {1, 2, 3, 4, 5, 6} 
//Output: arr[] = {6, 1, 5, 2, 4, 3} 



public class Max_min_form {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int n=arr.length;
		int start=0;
		int end=n-1;
		int temp[]=new int [n];
		
		for (int i=0;i<n;i++)
		{
			if (i%2==0)
			{
				temp[i]=arr[end--];
				
			}
			
			if (i%2!=0)
			{
				temp[i]=arr[start++];
				
			}
			
		}
		for (int a:temp)
		{
			System.out.print(a+" ");
		}
	}

}

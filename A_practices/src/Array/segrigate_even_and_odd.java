package Array;

//Input: arr[] = {7, 2, 9, 4, 6, 1, 3, 8, 5}
//Output: 2 4 6 8 7 9 1 3 5

//Input: arr[] = {1, 3, 2, 4, 7, 6, 9, 10}
//Output:  2 4 6 10 7 1 9 3


public class segrigate_even_and_odd {

	public static void main(String[] args) {
		int arr[]= {7, 2, 9, 4, 6, 1, 3, 8, 5};
		int n=arr.length;
		
		int position=0;
		
		for (int i=0;i<n;i++)
		{
			if (arr[i]%2==0)
			{
				int temp=arr[i];
				arr[i]=arr[position];
				arr[position]=temp;
				position++;
			}
		}
		
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		

	}

}

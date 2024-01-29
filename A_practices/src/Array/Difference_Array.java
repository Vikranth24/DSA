package Array;
/*Consider an array A[] of integers and following two types of queries. 

update(l, r, x) : Adds x to all values from A[l] to A[r] (both inclusive).
printArray() : Prints the current modified array.
Examples : 

Input : A [] { 10, 5, 20, 40 }
        update(0, 1, 10)
        printArray()
        update(1, 3, 20)
        update(2, 2, 30)
        printArray()
Output : 20 15 20 40
         20 35 70 60
Explanation : The query update(0, 1, 10) 
adds 10 to A[0] and A[1]. After update,
A[] becomes {20, 15, 20, 40}       
Query update(1, 3, 20) adds 20 to A[1],
A[2] and A[3]. After update, A[] becomes
{20, 35, 40, 60}.
Query update(2, 2, 30) adds 30 to A[2]. 
After update, A[] becomes {20, 35, 70, 60}.*/
public class Difference_Array {

	public static void main(String[] args) {
		int arr[]= {10, 5, 20, 40 };
		int n=arr.length;
		update(arr,n,0,1,10);
		printArray(arr);
		update(arr,n,1,3,20);
		update(arr,n,2,2,30);
		printArray(arr);
	}
	
	public static void printArray(int[] arr)
	{
		for (int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
	}
	
	public static void update(int[] arr, int n, int start, int end, int change)
	{
		for (int i=start;i<=end;i++)
		{
			int temp=arr[i]+change;
			arr[i]=temp;
		}
		
		
	}

}

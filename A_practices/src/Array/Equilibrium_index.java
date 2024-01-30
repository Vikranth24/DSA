package Array;
/*
 Given a sequence arr[] of size n, Write a function int equilibrium(int[] arr, int n) that returns an equilibrium index (if any) or -1 if no equilibrium index exists. 

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. 

Examples: 

Input: A[] = {-7, 1, 5, 2, -4, 3, 0} 
Output: 3 
3 is an equilibrium index, because: 
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 */
public class Equilibrium_index {

	public static void main(String[] args) {
		int[] arr= {-7, 1, 5, 2, -4, 3, 0};
		int n=arr.length;
		int iii=0;
		int jjj=0;
		int start=0;
		int end=n-1;
		int count =0;
		
		while(start<=end)
		{
			iii=iii+arr[start];
			jjj=jjj+arr[end];
			if (iii==jjj)
			{
				System.out.println((start+1)+" equilibrium ");
				count ++;
				break;
			}
			start++;
			end--;
			
				
		}
		if (count==0)
		{
			System.out.println("no equilibrium");
		}
		
	    

	}

}

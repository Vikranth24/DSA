package Array;
/*
 Given a sorted array A (sorted in ascending order), having N integers, find if there exists any pair of elements (A[i], A[j]) such that their sum is equal to X.

Illustration : 
input
               A[] = {10, 20, 35, 50, 75, 80}
                      X =70

output
              1 and 3
 */
public class Two_pointer {

	public static void main(String[] args) {
		int arr[]={10, 20, 35, 50, 75, 80};
		int n=arr.length;
		int x=70;
		int count =0;
		
		for (int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				if (arr[i]+arr[j]==x)
				{
					System.out.println(i+" and "+j);
					count=1;
				}
			}
			
		}
		if (count==0)
		{
			System.out.println("no pair");
		}

	}

}

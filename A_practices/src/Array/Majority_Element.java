package Array;
/*
 Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 

Examples : 

Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4
Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size. 

Input : A[] = {3, 3, 4, 2, 4, 4, 2, 4}
Output : No Majority Element
Explanation: There is no element whose frequency is greater than the half of the size of the array size.


 */
public class Majority_Element {

	public static void main(String[] args) {
		
		int arr[]= {3, 3, 4, 2, 4, 4, 2, 4};
		int n=arr.length;
		int i=0;
		int total=0;		
		
		while (i<n)
		{
			int count=1;
			for (int j=0;j<n;j++)
			{
				if (i==j)
				{
					continue;
				}
				else
				{
					if (arr[i]==arr[j])
					{
						count++;
					}
				}
			}
			
			if (count>(n)/2)
			{
				System.out.println(arr[i]);
				total=1;
				break;
			}
			i++;
			
		}
		if (total!=1)
		{
			System.out.println("no majority");
		}
		

	}

}

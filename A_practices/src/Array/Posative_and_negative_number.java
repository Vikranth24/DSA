package Array;

/*An array contains both positive and negative numbers in random order. Rearrange the array elements so that positive and negative numbers are placed alternatively. A number of positive and negative numbers need not be equal. If there are more positive numbers they appear at the end of the array. If there are more negative numbers, they too appear at the end of the array.

Example:

Input: [-1, 2, -3, 4, 5, 6, -7, 8, 9]
Output:[9, -7, 8, -3, 5, -1, 2, 4, 6]

Input: [-1, 3, -2, -4, 7, -5]
Output:[7, -2, 3, -5, -1, -4]*/
public class Posative_and_negative_number {

	public static void main(String[] args) {
		
		int arr[]= {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		int n=arr.length;
		int pos=0;
		
		
		for (int i=0;i<n;i++)
		{
			if (pos%2==0)
			{
				if(arr[i]>=0)
				{
					if (i!=pos)
					{
						int temp=arr[i];
						arr [i]=arr[pos];
						arr[pos]=temp;
						pos++;
						
					}
					else {
						pos++;
					}
					
					
				}
				
			}
			   if(pos%2!=0)
			{
				if(arr[i]<0)
				{
					if (i!=pos)
					{
						int temp=arr[i];
						arr [i]=arr[pos];
						arr[pos]=temp;
						pos++;
						
					}
					else {
						pos++;
					}
					
				}
			}
			
			
		}
		
		for (int a:arr)
		{
			System.out.println(a+" ");
		}
		
		

	}

}

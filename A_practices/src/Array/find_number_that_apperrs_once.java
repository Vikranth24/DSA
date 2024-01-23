package Array;
//Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
//Output: 2 
public class find_number_that_apperrs_once {

	public static void main(String[] args) {
		int arr[]={2, 3, 5,  3, 4};
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			int count =0;
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					continue;
				}
				else if(arr[i]==arr[j])
				{
					count++;
				}
				
				
			}
			
			if (count==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}

}

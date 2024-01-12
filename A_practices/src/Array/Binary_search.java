package Array;

public class Binary_search {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int low=0;
		int high=arr.length-1;
		
		int r=0;
		int k=1;
		while(low<=high)
		{
			int mid =low+(high-low)/2;
			
			if (arr[mid] ==k)
			{
				System.out.println(mid);
				r++;
				break;
			}
			
			if (arr[mid]>k)
			{
				high=mid-1;
			}
			
			if (arr[mid]<k)
			{
				low =mid+1;
			}
		}
		
		if (r==0)
		{
			System.out.println("not found");
		}
		
		

	}

}

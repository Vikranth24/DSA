package Array;


//Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
//Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};

//Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
//Output : arr[] = {1, 2, 3, 6, 0, 0, 0};



public class make_zero_to_end_of_array {

	public static void main(String[] args) {
		
		int [] arr= {1,2,4,0,6,0,5,7,0,8};
		int n=arr.length;
		int non_zero_pointer=0;
		
		for (int i=0;i<n;i++)
		{
			if (arr[i] != 0)
			{
				int temp =arr[i];
				 arr[i]=arr[non_zero_pointer];
				 arr[non_zero_pointer]=temp;
				 non_zero_pointer++;
				
			}
		}
		
		for (int a: arr)
		{
			System.out.print(a+" ");
		}

	}

}

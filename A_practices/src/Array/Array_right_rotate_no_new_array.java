package Array;

public class Array_right_rotate_no_new_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		int p=0;
		int d=2;
		
		while(p<d)
		{
			int last =arr[n-1];
			for (int i=n-1;i>0;i--)
			{
				arr[i]=arr[i-1];
				
			}
			arr[0]=last;
			p++;
		}
		for (int a:arr)
		{
			System.out.print(a+" ");
		}

	}

}

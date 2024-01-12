package Array;

public class linear_search {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		int key=8;
		int r=0;
		for(int a:arr)
		{
			if (a==key)
			{
				System.out.println("index "+a);
				r++;
			}
		}
		if (r==0)
		{
			System.out.println("number not found");
		}

		
		

	}

}

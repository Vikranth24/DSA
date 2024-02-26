package collections_Matrix;

public class Program_for_scalar_multiplication_of_a_matrix {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int row=arr.length;
		int column=arr[0].length;
		int k=5;
		
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
			
				System.out.print(arr[i][j]*5 +" ");
			}
			System.out.println();
		}
		
		
		

	}

}

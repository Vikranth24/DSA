package matrix;
/*
 * 
 input 
  1 2 3
  4 5 6
  7 8 9
  
 output
  1 4 7 
  2 5 8 
  3 6 9 
  
 */
public class Program_to_find_transpose_of_a_matrix {

	public static void main(String[] args) {
		
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int row =arr.length;
		
		int column=arr[0].length;
		
		
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		
	}

}

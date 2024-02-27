package matrix;

public class Print_element_in_matrix {

	public static void main(String[] args) {
		
		int arr[][]= new int [2][2];
		
		arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=3;
		arr[1][1]=4;
		
		int rows =arr.length;
		int column=arr[0].length;
		System.out.println(rows);
        System.out.println(column);		
		
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
			
		
		

	}

}

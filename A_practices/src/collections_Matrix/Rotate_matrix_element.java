package collections_Matrix;
/*
 Given a matrix, clockwise rotate elements in it.

Examples:

Input
1    2    3
4    5    6
7    8    9

Output:
4    1    2
7    5    3
8    9    6

For 4*4 matrix
Input:
1    2    3    4    
5    6    7    8
9    10   11   12
13   14   15   16

Output:
5    1    2    3
9    10   6    4
13   11   7    8
14   15   16   12

 */


//not correct
public class Rotate_matrix_element {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int row=arr.length;
		int column=arr[0].length;
		int next =arr[0][0];
	
		int i=0;
		int j=0;
		while (j<column)
			if(i<row-1 && j<column-1)
			{
				int current =next;
						
				next= arr[i][j+1];
				arr[i][j+1]=current;
				j++;
			}
			
		
			
		}
	
}

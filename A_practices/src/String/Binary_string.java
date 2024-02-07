package String;
/*
 A Binary String is a special kind of string made up of only two types of characters, such as 0 and 1.
For Example:  

Input: str = "01010101010"
Output: Yes, it is a Binary String

Input: str = "geeks101"
Output: No, it is not a Binary String
 */
public class Binary_string {
	public static void main(String []args)
	{
		String str ="10101ab010110101";
		char arr[]=str.toCharArray();
		
		int n=arr.length;
	    int count =0;
		
		for ( int i=0;i<n;i++)
		{
			if (arr[i]=='0' ||arr[i]== '1')
			{
				count++;
			}
			else {
				
				break;
			}
		}
		
		if (count ==0)
		{
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}

}

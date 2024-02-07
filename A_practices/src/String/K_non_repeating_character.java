package String;
/*
 Given a string str of length n (1 <= n <= 106) and a number k, the task is to find the kth non-repeating character in the string.

Examples: 

Input : str = geeksforgeeks, k = 3
Output : r
Explanation: First non-repeating character is f, second is o and third is r.

Input : str = geeksforgeeks, k = 2
Output : o 
 */
public class K_non_repeating_character {

	public static void main(String[] args) {
		String str="geeksforgeeks";
		int k=3;
		int point=0;
		int n=str.length();
		
		
		int start=0;
		
		while (start<n)
		{
			int count=0;
		
			for(int i=0;i<n;i++)
			{
				if (str.charAt(start)==str.charAt(i))
				{
					count++;
					
				}
			}
			
			if (count==1)
			{
				point++;
			}
			if(point==k)
			{
				System.out.println(str.charAt(start));
				break;
			}
			start++;
			
		}
		

	}

}

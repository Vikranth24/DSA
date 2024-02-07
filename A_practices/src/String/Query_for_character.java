package String;
/*
 Given a string, X. Form a string S by repeating string X multiple times i.e appending string X multiple times with itself. There are Q queries of forms i and j. The task is to print “Yes” if the element at index i is the same as the element at index j in S else print “No” for each query.

Examples : 

Input : X = "geeksforgeeks", Q = 3.
Query 1: 0 8
Query 2: 8 13
Query 3: 6 15

Output :
Yes
Yes
No

String S will be "geeksforgeeksgeeksforgeeks....".
For Query 1, index 0 and index 8 have same element i.e 'g'.
For Query 2, index 8 and index 13 have same element i.e 'g'.
For Query 3, index 6 = 'o' and index 15 = 'e' which are not same.
 */
public class Query_for_character {
	
	public static void query(String str,int start, int end,int n)
	{
		if (end>=n)
		{
			int temp=end-n;
			end=temp;
		}
		
		if(str.charAt(start)==str.charAt(end))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		
	}

	public static void main(String[] args) {
		String str="geeksforgeeks";
		int n=str.length();
		
		Query_for_character.query(str,0,8,n);
		Query_for_character.query(str,8,13,n);
		Query_for_character.query(str,6,15,n);
		
		
		
	}

}

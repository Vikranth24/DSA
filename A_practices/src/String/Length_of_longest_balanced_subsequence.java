package String;
/*
 Given a string S, find the length of the longest balanced subsequence in it. A balanced string is defined as:- 

A null string is a balanced string.
If X and Y are balanced strings, then (X)Y and XY are balanced strings.
Examples: 

Input : S = "()())"
Output : 4

()() is the longest balanced subsequence 
of length 4.

Input : s = "()(((((()"
Output : 4
 */
public class Length_of_longest_balanced_subsequence {

	public static void main(String[] args) {
		
	 
		String str="()(()()((()";
		int n=str.length();
		int open=0;
		int close=0;
		
		
		for (int i=0;i<n;i++)
		{
			if(str.charAt(i)=='(')
			{
				open++;
			}
			if(str.charAt(i)==')')
			{
				close++;
			}
		}
		
		if(open>close || open==close)
		{
			int temp=close*2;
			
			System.out.println(temp);
		}
		
		if(close>open)
		{
			int temp=open*2;
			open=temp;
			System.out.println(open);
		}
		
		
		
		

	}

}

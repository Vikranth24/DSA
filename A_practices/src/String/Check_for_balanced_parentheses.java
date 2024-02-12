package String;
/*
 Given a string of length n having parentheses in it, your task is to find whether given string has balanced parentheses or not. Please note there is constraint on space i.e. we are allowed to use only O(1) extra space.

Also See : Check for balanced parentheses

Examples:  

Input : (())[]
Output : Yes

Input : ))(({}{
Output : No
 */
public class Check_for_balanced_parentheses {

	public static void main(String[] args) {
	 
		String str="))(({}{";
		int n=str.length();
		
		int open_count=0;
		int close_count=0;
		
		for(int i=0;i<n;i++)
		{
			if (str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{')
			{
				open_count++;
				
			}
			if(str.charAt(i)==')' || str.charAt(i)==']' || str.charAt(i)=='}')
			{
				close_count++;
				
				if(close_count>open_count)
				{
					break;
				}
			}
		}
		
		if (open_count==close_count)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		

	}

}

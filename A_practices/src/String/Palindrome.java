package String;
/*
 A string is said to be a palindrome if the reverse of the string is the same as the string. 
For example,

“abba” is a palindrome, but “abbc” is not a palindrome.
 */
public class Palindrome {

	public static void main(String[] args) {
		String str="abafba";
		int n=str.length();
		int end =n-1;
		int start=0;
		int count =0;
		while (start<end)
		{
			if (str.charAt(start)==str.charAt(end))
			{
				start++;
				end--;
			}
			else
			{
				count++;
				break;
			}
		}
		
		if (count ==1)
		{
			System.out.println(str+" is not a palindrome");
		}
		else
		{
			System.out.println(str+" is a  palindrome");
		}
		
		
		
		

	}

}

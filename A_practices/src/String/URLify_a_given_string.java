package String;
/*
 Write a method to replace all the spaces in a string with ‘%20’. You may assume that the string has sufficient space at the end to hold the additional characters and that you are given the “true” length of the string.
Examples: 

Input: "Mr John Smith", 13
Output: Mr%20John%20Smith

Input: "Mr John Smith   ", 13
Output: Mr%20John%20Smith
 */
public class URLify_a_given_string {

	public static void main(String[] args) 
	{
		String str="Mr John Smith";
		int n=str.length();
		
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)==' ')
			{
				str=str.substring(0,i)+"%20"+str.substring(i+1);
			}
		}
		
		System.out.println(str);
		
		
		

	}

}

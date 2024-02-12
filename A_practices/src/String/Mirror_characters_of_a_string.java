package String;
/*
 Given a string and a number N, we need to mirror the characters from N-th position up to the length of the string in the alphabetical order. In mirror operation, we change ‘a’ to ‘z’, ‘b’ to ‘y’, and so on.

Examples: 

Input : N = 3
        paradox
Output : paizwlc
We mirror characters from position 3 to end.

Input : N = 6
        pneumonia
Output : pnefnlmrz
 */
public class Mirror_characters_of_a_string {

	public static void main(String[] args) {
		
		String str="pneumonia";
		int n=str.length();
		int m=3;
		String r=str.substring(0, m);
		
		for (int i=m;i<n;i++)
		{
			int j=str.charAt(i)-96;
			
			
				int k=27-j;
			    k=k+96;
			    char o=(char)k;
			    r=r+o;
				
			
		}
		
		System.out.println(r);
		
		
		
		

	}

}

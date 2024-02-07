package String;
/*
 Input : geeks
Output : geekt
The last character 's' is changed to 't'.

Input : raavz
Output : raawz
Since we can't increase last character, 
we increment previous character.

Input :  zzz
Output : zzza


If string is empty, we return ‘a’. If string contains all characters
 as ‘z’, we append ‘a’ at the end. Otherwise we find first 
 character from end which is not z and increment it.
 */
public class Lexicographically_next_string {

	public static void main(String[] args) {
		String str="zzz";
		int n=str.length();
		int count=0;
		
		
		for (int i=n-1;i>=0;i--)
		{
			if (str.charAt(i)==122)
			{
				continue;
			}
			else
			{
				int temp=str.charAt(i);
				char ch =(char)(temp+1);
				str=str.substring(0,i)+ch+str.substring(i+1);
				count++;
				break;
			}
			
		}
		if (count ==0)
		{
			str=str+'a';
		}
		
        System.out.println(str);
	}

}

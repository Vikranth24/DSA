package String;

/*
 Given a sentence, task is to remove spaces from the sentence and rewrite in Camel case. It is a style of writing where we don’t have spaces and all words begin with capital letters.

Examples: 

Input  : I got intern at geeksforgeeks
Output : IGotInternAtGeeksforgeeks

Input :  Here comes the garden
Output : HereComesTheGarden
 */
public class Camel_case {

	public static void main(String[] args) {
	String str=	"I got intern at geeksforgeeks"	;
	
	
	for (int i=0;i<str.length();i++)
	{
		if (str.charAt(i)==' ')
		{
			String temp =""+ str.charAt(i+1);
			temp=temp.toUpperCase();
			char aaa=temp.charAt(0);
			
			str=str.substring(0,i)+temp+str.substring(i+2);
			
		}
		
	
		
	}
	System.out.println(str);
	
	
	
	}

}





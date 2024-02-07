package String;
/*
 Given a string, find the minimum and the maximum length words in it. 

Examples: 

Input : "This is a test string"
Output : Minimum length word: a
         Maximum length word: string
Input : "GeeksforGeeks A computer Science portal for Geeks"
Output : Minimum length word: A
         Maximum length word: GeeksforGeeks
 */
public class Find_small_and_large_word {

	public static void main(String[] args) {
		
		String str="GeeksforGeeks A computer Science portal for Geeks";
	  int n=str.length();
	  String max =null;
	  String min=null;
	  int start=0;
	  String count="";
	  
	  while (start<n)
	  {
		  for(int i=start;i<n;i++)
		  {
			  
			 
			  if (str.charAt(i)!= ' ')
			  {
				  count =count+str.charAt(i);
			  }
			  
			  if (str.charAt(i) == ' ' || i==n-1)
			  {
				  if (max ==null && min==null)
				  {
					  max=count;
					  min=count;
				  }
				  start=i+1;
				  if (max.length()<count.length())
				  {
					  max=count;
				  }
				  if(min.length()>count.length())
				  {
					 min=count; 
				  }
				  count ="";
			  }
			 
			  
		  }
	  }
			  
		System.out.println("max is "+ max);
		System.out.println("min is "+ min );

	}

}

package String;
/*
 Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.(Considering no two words are the second most repeated, there will be always a single word).

Examples: 

Input : {"aaa", "bbb", "ccc", "bbb", 
         "aaa", "aaa"}
Output : bbb
Input : {"geeks", "for", "geeks", "for", 
          "geeks", "aaa"}
Output : for

 */
public class Second_most_repeated_word {

	public static void main(String[] args) {
		
		String[] arr= {"aaa", "bbb", "ccc", "bbb", 
		         "aaa", "aaa"};
		int start=0;
		int n=arr.length;
		String first_index=null;
		String second_index=null;
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		
		
	while(start<n)
	{
		int count=1;
	
		
		for(int i=0;i<n;i++)
		{
		
			if (arr[start].equals(arr[i]) ) 
			{
				
				count++;
				
			}
			
			
		}
		
		if(max<count)
		{
			
			
			first_index=arr[start];
			max2=max;
			max=count;
			
			
			
		}
		else if(max2<count && count!=max)
		{
			
			second_index=arr[start];
			max2=count;
			
			
		}
		start++;
		
		
	}
	
	System.out.println(second_index);
	}

}

package String;
/*
 You are given a string of 2N characters consisting of N ‘[‘ brackets and N ‘]’ brackets. A string is considered balanced if it can be represented in the form S2[S1] where S1 and S2 are balanced strings. We can make an unbalanced string balanced by swapping adjacent characters. Calculate the minimum number of swaps necessary to make a string balanced.

Examples: 

Input  : []][][
Output : 2
First swap: Position 3 and 4
[][]][
Second swap: Position 5 and 6
[][][]
Input  : [[][]]
Output : 0
The string is already balanced.
 */

//not correct
public class Minimum_Swaps_for_Bracket_Balancing {

	public static void main(String[] args) {
		
		String str="[]][][";
		int n=str.length();
	    int start=0;
	    int open=0;
	    int close=0;
	    
	    
	   
	    	for (int i=start;i<n;i++)
	    	{
	    		if(str.charAt(i)=='[')
	    		{
	    			open++;
	    		}
	    		else
	    		{
	    			close++;
	    		}
	    		if (close>open)
	    		{
	    			start=i;
	    			
	    		}
	    	}
	    

	}

}

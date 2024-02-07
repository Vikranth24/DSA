package String;
/*
 Given an input string and a dictionary of words, find out if the input string can be segmented into a space-separated sequence of dictionary words. See following examples for more details. 

This is a famous Google interview question, also being asked by many other companies now a days.

Consider the following dictionary 
{ i, like, sam, sung, samsung, mobile, ice, 
  cream, icecream, man, go, mango}
Input:  ilike
Output: Yes 
The string can be segmented as "i like".
Input:  ilikesamsung
Output: Yes
The string can be segmented as "i like samsung" or 
"i like sam sung".
 */
public class Word_break_problem {

	public static void main(String[] args) {
		
		 String  str=" i, like, sam, sung, samsung, mobile, ice,  cream, icecream, man, go, mango";
		int n=str.length();
		boolean r=false;
         String test="ilikesamsung";
         int m=test.length()-1;
         
         int start =0;
         while (start<m)
         {
        	 for(int i=0;i<n;i++)
        	 {
        		 if (test.charAt(start)==str.charAt(i))
        		 {
        			 if(str.charAt(i+1)==',' && str.charAt(i+3)==test.charAt(start+1))
        			 {
        				 System.out.println("yes");
        				 r=true;
        				 break;
        				 
        			 }
        		 }
        	 }
        	 if (r)
        	 {
        		 break;
        	 }
        	 start++;
         }
	}

}

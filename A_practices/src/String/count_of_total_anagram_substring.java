package String;
/*
 Given a string of lower alphabet characters, count total substring of this string which are anagram to each other.

Examples:

Input  : str = “xyyx”
Output : 4
Total substrings of this string which
are anagram to each other are 4 which 
can be enumerated as,
{“x”, “x”}, {"y", "y"}, {“xy”, “yx”}, 
{“xyy”, “yyx”}

Input  : str = "geeg"
Output : 4
 */
public class count_of_total_anagram_substring {

	public static void main(String[] args) {

    String str="xyyx";
    int n=str.length();
    int start=0;
    int end=n-1;
    String y=null;
	String x=null;
  while(start<str.length()-1)
  {
    	x=x+str.charAt(start);
    
    	
    }
	while(end>0)
	{
		
		 y=y+str.charAt(end);
	}
	
	

}}

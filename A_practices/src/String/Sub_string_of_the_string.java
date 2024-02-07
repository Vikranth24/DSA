package String;


/*g, ge, gee, geek, geeks,
e, ee, eek, eeks,
e, ek, eks,
k, ks, 
ks*/
public class Sub_string_of_the_string {

	public static void main(String[] args) {
		
		String str="geeks";
		char arr[]=str.toCharArray();
		int n=arr.length;
	    int start=0;
	    String s="";
	    while (start<n) {
	    	for (int i=start;i<n;i++)
			{
				
					s=s+arr[i];
					System.out.println(s);
				

	         }
	    	start++;
	    	s="";
	    	
	    }
		
		
		
}}

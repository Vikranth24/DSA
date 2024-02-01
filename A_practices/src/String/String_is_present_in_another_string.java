package String;

public class String_is_present_in_another_string {

	public static void main(String[] args) {
	   String a="vikram";
	   String b="ram";
	   
	   //using contains() method.
	   
	   boolean c=a.contains(b);
	   System.out.println(c);
	   
	   
	   
	   
	   // not using inbuilt method.
	   
	   
	   int m=a.length();
	   int n=b.length();

	   
	  for (int i=0;i<= m-n;i++)
	   {
		  int j;
		   for ( j=0;j<n;j++)
		   {
			   if (a.charAt(i+j)!=b.charAt(j))
			   {
				
				   break;
			   }
		   }
		   if(j==n)
	   {
			   System.out.println("string is present");
			   }
	   }
	   
	   
	   }

}

package String;

public class Trim_a_string {

	public static void main(String[] args) {
		
		//Usign inbuilt method trim().
		
		String s=" hai bye ";
		String a=s.trim();
		
		System.out.println(a);
		
		
		//Not using inbuilt method
		
		char arr[]=s.toCharArray();
		StringBuilder x=new StringBuilder();		
		for (char r:arr)
			
		{
			if (r!=' ')
			{
				x.append(r);
				
			}
			
			
		}
		
		System.out.println(x);
		
		
		

	}

}








package String;

/*
  intput   String s="12345"
  output      12345 (int)
 */
public class convert_String_to_integer {

	public static void main(String[] args) {
		
		String str="12345";
		int n=str.length();
		
		for (int i=0;i<n;i++)
		{
			int r=str.charAt(i);
			r=r-48;
			System.out.print(r);
		}
		System.out.println();
		
		//using inbuilt method
		
		int k=Integer.parseInt(str);
		System.out.println(k);
	
		

	}

}

package String;

public class Find_length_of_string {

	public static void main(String[] args) {
		
		//Using inbuilt method length()
		String s="vikram";
		System.out.println(s.length());
		
		//Not using inbuilt method
		char[] arr=s.toCharArray();
		int length=0;
		for (char b:arr)
		{
			length++;
		}
		System.out.println(length);
		

	}

}

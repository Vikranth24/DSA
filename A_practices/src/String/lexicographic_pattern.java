package String;

public class lexicographic_pattern {

	public static void main(String[] args) {
		String str ="AabG";
		int n=str.length();
		int count=0;
		
		for (int i=0;i<n-1;i++)
		{
			if(str.charAt(i)<str.charAt(i+1))
			{
				
			}
			else {
				count++;
				break;
			}
		}
		if (count==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}

package String;
//ignore this
public class Replace_substring_of_string {

	public static void main(String[] args) {
		
		String str="abaaba";
		String pattern="aba";
		String replace="a";
		
		int n=str.length();
		int m=pattern.length();
		for (int i=0;i<=n-m;i++)
		{
			int count =0;
			for(int j=0;j<m;j++)
			{
				if (str.charAt(i+j)==pattern.charAt(j))
				{
					count++;
					
				}
				else {
					
					break;
				}
				
				if (count==m)
				{
					 
				}
			}
		}
		
		
	}

}

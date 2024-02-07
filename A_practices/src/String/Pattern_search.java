package String;
/*
  input s="AABAABACDEGSAABA";
  output  0,3,12
  explanation   print start indexs where the the pattern matches
 */
public class Pattern_search {

	public static void main(String[] args) {
		String str="AABAABACDEGSAABA";
		String pattern="AABA";
		int m=pattern.length();
		int n=str.length();
	  
	   
		
		for (int i=0; i<=n-m;i++)
		{ int count=0;
			for(int j=0;j<m;j++)
			{
				if(str.charAt(i+j) !=pattern.charAt(j))
				{
					break;
				}
				else {
					count++;
				}
			}
			if (count ==m)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}

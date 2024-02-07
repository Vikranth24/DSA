package String;
/*
 Given a string s, find the number of pairs of characters that are same. Pairs (s[i], s[j]), (s[j], s[i]), (s[i], s[i]), (s[j], s[j]) should be considered different. 

Examples :

Input: air
Output: 3
Explanation :
3 pairs that are equal are (a, a), (i, i) and (r, r)
Input : geeksforgeeks
Output : 31
 */
public class count_number_of_equal_pair {

	public static void main(String[] args) {
		
		String str="geeksforgeeks";
		int n=str.length();
		int count=0;
		
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if (str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
		}
		
		System.out.println(count);
		

	}

}

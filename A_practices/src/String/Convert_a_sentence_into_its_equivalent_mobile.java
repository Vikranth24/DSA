package String;
/*
 Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence. 

Mobile-keypad

Examples : check geeks for geeks intermediate questions.

Input: GEEKSFORGEEKS
Output: 4333355777733366677743333557777
Explanation: For obtaining a number, we need to press a number corresponding to that character for a number of times equal to the position of the character. For example, for character E, press number 3 two times and accordingly.
 */
public class Convert_a_sentence_into_its_equivalent_mobile {

	public static void main(String[] args) {
		
		String str="GEEKSFORGEEKS";
		int n=str.length();
		String []arr= {"2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999"};
		
		String output="";
		
		for (int i=0;i<n;i++)
		{
			if (str.charAt(i)==0)
			{
				output=output+"0";
			}
			
			else
			{
				int position =str.charAt(i)-'A';
				output=output+arr[position];
				
			}
		}
		
		System.out.println(output);
		
	}

}

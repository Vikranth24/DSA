package String;

public class Replace_in_string {

	public static void main(String[] args) {
		
		
		// To replace single letter use replace(char in string, char needs to replace)
		String s="hai";
		String v=s.replace("h", "3");
		String u=s.replace('i', '6');
		System.out.println(v);
		System.out.println(u);
		
		
		
		//To replace all substring use replace all (string ,string)
		String l="hai,hai,hai";
		String r= l.replaceAll("hai", "bye");
		System.out.println(r);
		
		
		// To replace only the first char sequence use replacefirst(string,string)
		String n="hai hai hai";
		
		String k=n.replaceFirst("hai","bye");
		
		System.out.println(k);

	}

}

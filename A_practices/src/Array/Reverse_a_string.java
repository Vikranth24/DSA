package Array;

public class Reverse_a_string {

	public static void main(String[] args) {
		
		
		//Using inbuilt method reverse() method in stringBuilder
		String x="vikram";
		
	 StringBuilder r=new StringBuilder(x);
	 r.reverse();
	 
	 System.out.println(r);
	 
	 //Not using inbuilt method
	 
	 char arr[]=x.toCharArray();
	 int n=arr.length;
	 StringBuilder t=new StringBuilder();
	 for (int i=n-1;i>=0;i--)
	 {
		 t.append(arr[i]);
	 }
	 
	 System.out.println(t);
	 }

}

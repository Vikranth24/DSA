package Array;

public class reverse_array_string {
	
	
	public static void main(String [] args)
	{
		String str ="stRing";
		char [] arr=str.toCharArray();
		int start=0;
		int end =arr.length-1;
		char temp;
		while (start<end)
		{
			temp =arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		String s=new String(arr);
		System.out.println(s);
	}
	
	
	
	
	
	
	
	
	

}

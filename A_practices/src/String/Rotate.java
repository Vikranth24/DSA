package String;

public class Rotate {

	public static void main(String[] args) {
		//whith out using inbuilt methods
		String s="vikram";
		int r=2;
		int n=s.length();
		int end =n-1;
		char arr[]=s.toCharArray();
		for (int i=0;i<r;i++)
		{
			char temp=arr[0];
			for (int j=i+1;j<n;j++)
			{
				
				arr[j-1]=arr[j];
			}
			arr[end]=temp;
			
			
			
			
		}
		
		String v=new String(arr);
		System.out.println(v);
		
		
		//using inbuilt method
		
		String first =s.substring(0, 2);
		String last  = s.substring(2);
		System.out.println(last.concat(first));
		

	}

}

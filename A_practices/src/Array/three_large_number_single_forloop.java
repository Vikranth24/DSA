package Array;

public class three_large_number_single_forloop {

	public static void main(String[] args) {
   int [] arr= {3,5,9,1,2};
   int first,second,third;
   first=Integer.MIN_VALUE;
   second=Integer.MIN_VALUE;
   third=Integer.MIN_VALUE;
  
   for (int i=0;i<arr.length;i++)
   {
	   if (arr[i]>first)
	   {
		   third=second;
		   second=first;
		   first=arr[i];
		   
	   }
	   else if (arr[i]>second)
	   {
		   third=second;
		   second=arr[i];
		   
		   
	   }
	   else if (arr[i]>third)
	   {
		   third=arr[i];
		   
	   }
	 
   }
   System.out.println(first+" "+second+" "+third);

	}

}

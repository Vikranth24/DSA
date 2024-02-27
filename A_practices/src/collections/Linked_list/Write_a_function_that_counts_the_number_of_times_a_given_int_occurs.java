package collections.Linked_list;

public class Write_a_function_that_counts_the_number_of_times_a_given_int_occurs extends linked {

	public static void main(String[] args) {
		linked link =new linked();
		link.addfirst(10);
		link.addlast(10);
		link.addfirst(20);
		link.addfirst(30);
		link.addlast(10);
		count(40);

	}
	
	public static void count(int data)
	{
		Node_01 current=head;
		
		int count =0;
		
		while (current!=null)
		{
			if (data ==current.data)
			{
				count++;
			}
			current=current.next;
		}
		if (count ==0)
		{
			System.out.println("no number");
		}
		else
		System.out.println(count);
	}

}

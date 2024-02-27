package collections.Linked_list;

public class Find_the_middle_of_a_given_linked_list extends linked {

	public static void main(String[] args) {
		linked link =new linked();
		link.addfirst(10);
		link.addfirst(20);
		link.addfirst(30);
		link.addfirst(40);
		link.addfirst(50);
		link.addfirst(60);
		link.addfirst(70);
		
		
		mid();
		
		print();
		
		
		

	}
	
	public static void print()
	{
		Node_01 current=head;
		
		
		while (current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
			
		}
		
		
		
			
	}
	public static void mid()
	{
		Node_01 current =head;
		Node_01 forward =head;
		int forward_count=0;
		int count=1;
		
		while (current !=null)
		{
			if (count ==0)
			{
				current=current.next;
			 	count++;
			 	continue;
			 	
			}
			
			 if (forward_count< count/2 )
			{
				forward=forward.next;
				forward_count++;
				count++;
				current=current.next;
				continue;
				
			}
			
			count++;
			current=current.next;
			
		}
		System.out.println(forward.data );
		
	}

}

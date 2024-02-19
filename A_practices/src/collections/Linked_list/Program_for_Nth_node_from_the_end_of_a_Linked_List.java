package collections.Linked_list;
/*
 Input: 1 -> 2 -> 3 -> 4, N = 3
Output: 2

Input: 35 -> 15 -> 4 -> 20, N = 4
Output: 35   
 */
public class Program_for_Nth_node_from_the_end_of_a_Linked_List extends linked {

	public static void main(String[] args) {
		
		linked link =new linked();
		link.addlast(10);
		link.addlast(20);
		link.addlast(30);
		link.addlast(40);
		link.addlast(50);
		link.addlast(60);
		link.addlast(70);
		link.addlast(80);
		link.addlast(90);
		link.addlast(100);
		
		Nth(3);
		
		
		

	}
	
	


	public static void Nth(int position)
	{
		Node_01 current=head;
		Node_01 forward= current;
		int count=0;
		
		while(current!=null)
		{
			if (count==position)
			{
				forward=forward.next;
				current=current.next;
				continue;
			}
			current=current.next;
			count++;
		}
		
		System.out.println(forward.data);
	}

}

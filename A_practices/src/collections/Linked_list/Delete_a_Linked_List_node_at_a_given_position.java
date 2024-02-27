package collections.Linked_list;

public class Delete_a_Linked_List_node_at_a_given_position extends linked{

	public static void main(String[] args) {
		linked link =new linked();
		link.addfirst(10);
		link.addfirst(20);
		link.addfirst(30);
		
		link.addfirst(40);
		
		print();
		delete_by_position(4);
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
		System.out.println();
		
		
			
	}

}


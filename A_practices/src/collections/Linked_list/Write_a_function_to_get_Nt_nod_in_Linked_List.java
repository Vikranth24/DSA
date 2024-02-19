package collections.Linked_list;

public class Write_a_function_to_get_Nt_nod_in_Linked_List extends linked {

	public static void main(String[] args) {
		
		linked link =new linked();
		link.addfirst(10);
		link.addfirst(20);
		link.addfirst(30);
		
		link.addfirst(40);
		
		
		get_data_based_on_position(3);;
		
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

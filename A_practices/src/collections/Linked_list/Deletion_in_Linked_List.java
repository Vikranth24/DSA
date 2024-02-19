package collections.Linked_list;

public class Deletion_in_Linked_List extends linked {

	public static void main(String[] args) {
		linked link =new linked();
		link.addfirst(10);
		link.addfirst(20);
		link.addfirst(30);
		
		link.addlast(100);
		
		print();
		delete(20);
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



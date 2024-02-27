package collections.Linked_list;
//not correct
public class Check_if_a_linked_list_is_Circular_Linked_List extends linked {

	public static void main(String[] args) throws Exception {
		linked link =new linked();
		link.addfirst(10);
		link.addfirst(20);
		link.addfirst(30);
		
		link.addlast(100);
		circular_linked_list();
		check_circular();

	}
	
	public static void check_circular() throws Exception
	{
		Node_01 current=head;
		
		   if (head == null) {
	            System.out.println("Empty linked list");
		   }
		
	     while( current.next!=null && current.next!=head)
		{
	    	 
			current=current.next;
		}
	     
	     if( current.next==null)
	     {
	    	 System.out.println("not a circular linked list");
	     }
	     else if( current.next==head)
	     {
	    	 System.out.println("is a circular linked list");
	     }
		
		
	}

}


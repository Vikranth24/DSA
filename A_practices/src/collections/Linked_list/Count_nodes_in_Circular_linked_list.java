package collections.Linked_list;

public class Count_nodes_in_Circular_linked_list extends linked {

	public static void main(String[] args) {
		linked link =new linked();
		link.addfirst(10);
		link.addfirst(20);
		link.addfirst(30);
		
		link.addlast(100);
		circular_linked_list();
		circle_node_count();
		

	}
	public static void circle_node_count()
	{
		Node_01 current =head;
		int count=0;
		
		if(head==null)
		{
			System.out.println("empty");
			return;
		}
		else if (head.next==head)
		{
			count++;
			System.out.println(count);
			return;
			
		}
		else
		{
			count=1;
			current=current.next;
		}
			
		
		
		
		while(current!=head )
		{
			count++;
			current=current.next;
		}
		
		System.out.println(count);
	
		
		
		
		
	}

	
	
}




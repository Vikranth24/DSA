package collections.Linked_list;

public class linked {
	
	public static Node_01 head;
	public void addfirst(int data)
	{
		
		 Node_01 node=new Node_01(data);
		 
		if (head==null)
		{
			head=node;
			return;
			
		}
		
		node.next=head;
		head=node;
		
		
				 
	}

	public void addlast(int data)
	{
		
		 Node_01 node=new Node_01(data);
		 Node_01 current=head;
		 
		if (head==null)
		{
			head=node;
			return;
			
		}
		
		while (current.next!=null)
		{
			
			current=current.next;
		}
		
		current.next=node;
		
		
				 
	}
	
	public static void length()
	{
		
		Node_01 current=head;
		int count=-1;
		while (current!=null)
		{
			current=current.next;
			count++;
		}
		
		System.out.println(count);
	}
	
	
	public static void reverse()
	{
		
		
		
		Node_01 current =head;
		Node_01 forward=head;
		Node_01 hai =null;
		
		
		while (current!=null)
		{
			current=current.next;
			forward.next=hai;
			hai=forward;
			forward=current;
			
			
		}
	
		head = hai;
		
		
	}
	
	
	public static void delete(int data)
	{
		
		Node_01 current=head;
		Node_01 pre =null;
		
	    while (current!=null)
	    {
	    	if (current.data==data)
	    	{
	    		if (pre==null)
	    		{
	    			head=current.next;
	    			return;
	    		}
	    		else if(current.next==null)
	    		{
	    			pre.next=null;
	    		}
	    		else
	    		{
	    			pre.next=current.next;
	    			return;
	    		}
	    		
	    		
	    	}
	    	pre=current;
	    	current=current.next;
	    }
	}
	
	
	@SuppressWarnings("null")
	public static void delete_by_position(int position)
	{
		Node_01 current=head;
		Node_01 pre=null;
		int count=1;
		
		while (current!=null)
		{
			if(count==position)
			{
				if (pre==null)
				{
					head =current.next;
					return;
				}
				else if (current.next==null)
				{
					pre.next=null;
					return;
	    		}
				}
				else if(pre!=null && current.next!=null)
				{
					pre.next=current.next;
					return;
				}
			}
			
			pre=current;
			current=current.next;
			count++;
		}
	
	
	public static void get_data_based_on_position(int position)
	{
		Node_01 current=head;
		int count =0;
		while (current!=null)
		{
			if (count ==position)
				
			{
				
				System.out.print( current.data+" ");
				return;
			}
			count++;
			current=current.next;
		}
		
	}
	
	
	public static void circular_linked_list()
	{
		
		if (head==null)
		{
			return;
		}
		
		Node_01 current =head;
		
		while (current.next!=null)
		{
			current=current.next;
			
		}
		current.next=head;
		
	}
	
	
	}
	
	



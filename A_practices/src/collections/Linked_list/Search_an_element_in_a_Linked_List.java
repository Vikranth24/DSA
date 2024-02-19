package collections.Linked_list;


/*
 Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not. 

Examples:

Input: 14->21->11->30->10, X = 14
Output: Yes
Explanation: 14 is present in the linked list.

Input: 6->21->17->30->10->8, X = 13
Output: No


 */
public class Search_an_element_in_a_Linked_List extends linke {

	public static void main(String[] args) {
	
		linke l=new linke();
		l.addlast(10);
		l.addlast(20);
		l.addlast(30);
		
		
		Search_an_element_in_a_Linked_List.search(11);
		Search_an_element_in_a_Linked_List.search(20);
	}
	
	public static void search(int x)
	{
		Nodee current =head;
		int count =0;
		while (current.next!=null)
		{
			if (current.data==x)
			{
				System.out.println("yes");
				count++;
				break;
			}
			current=current .next;
			
		}
		if (current.data==x && count !=1)
		{
			System.out.println("yes");
		}
		else if(count !=1)
		{
			System.out.println("no");
		}
		
	}
	
	public static void print()
	{
		Nodee current =head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
		
	}

} 
class Nodee
{
	int data ;
	Nodee next;
	
	Nodee(int data)
	{
		this .data=data;
		this .next=null;
	}
}
class linke
{
	static Nodee head;
	
	public void addfirst(int data)
	{
		Nodee nnn=new Nodee(data);
		nnn.next=head;
		head=nnn;
		
	}
	
	public void addlast(int data)
	{
		Nodee nnn=new Nodee(data);
		
		if (head==null)
		{
			head=nnn;
			return;
		}
		
		Nodee current =head;
		while (current.next!=null)
		{
			current=current.next;
			
		}
		
		current.next=nnn;
		
		
		
	}
	
}


package stack;

public class Print_stack {
	
	public static void main(String[] args) {
	
		stack s=new stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		s.print();
		System.out.println("pop");
		s.pop();
		System.out.println("peek");
		s.peek();
		System.out.println("remain");
		s.print();
	System.out.println(s.isEmpty() + " is empty");	
	

	}

}













package stack;

public class stack {
	
static final int MAX =1000;
	
	int a[]=new int [MAX]	;
	static int top;
	public  boolean isEmpty()
	{
		return (top<0);
		
	}
	stack()
	{
		top=-1;
	}
	
	public void push(int x)
	{
		if(top>MAX-1)
		{
			System.out.println("overflow");
			return ;
			
		}
		
		else
		{
			a[++top]=x;
			return;
		}
	}
	
	public void pop()
	{
		if(top<0)
		{
		System.out.println("no element");	
		}
		else
		{
			int x=a[top--];
			System.out.println(x);
			return;
			
		}
			
		
	}
	public void peek()
	{
	if (top<0)	
	{
		System.out.println("no element");
	}
	else
	{
		
		System.out.println(a[top]);
	}
	}
	
	public void print()
	{
		for(int i=top;i>-1;i--)
		{
		System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	
	public void reverse()
	{
		int arr[]=new int[top+1];
		int count=0;
		
		for(int i=top;i>-1;i--)
		{
			arr[count]=a[top--];
			count++;
		}
		
		for(int i=arr.length-1;i>=0;i--)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println();
				
	}

	
}






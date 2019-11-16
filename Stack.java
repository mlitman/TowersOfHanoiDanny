
public class Stack 
{
	private Node top;
	
	public Stack()
	{
		this.top = null;
	}
	
	public Node peek()
	{
		return this.top;
	}
	
	public Node pop()
	{
		if(this.top != null)
		{
			Node node2Return = this.top;
			this.top = this.top.getNextNode();
			return node2Return;
		}
		throw new RuntimeException("Empty Stack - Can't Pop!");
	}
	
	public void push(int payload)
	{
		Node n = new Node(payload);
		n.setNextNode(top);
		this.top = n;
	}
	
	public void display()
	{
		Stack temp = new Stack();
		Node tempNode;
		while(this.top != null)
		{
			tempNode = this.pop();
			System.out.println(tempNode.getPayload());
			temp.push(tempNode.getPayload());
		}
		
		while(temp.peek() != null)
		{
			this.push(temp.pop().getPayload());
		}
	}
}

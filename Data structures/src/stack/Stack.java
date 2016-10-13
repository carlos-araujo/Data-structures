package stack;

/**
 *
 * @author Carlos
 */
public class Stack {
    Node top;
    
    public void push(int data){
        Node n=new Node(data);
        n.next=top;
        top=n;
                
    }
    
    public int pop() throws Exception{
        
        if(top==null) throw new Exception("Stack is empty!");
        
        int value=top.data;
        top=top.next;
        return value;
        
    }
    
    public int peek() throws Exception{
        if(top==null) throw new Exception("Stack is empty!");
        
        return top.data;
    }
    
    public void printStack() throws Exception{
        if(top==null) throw new Exception("Stack is empty!");
        Node current=top;
        while (current!=null){
            System.out.print("| "+current.data+" |\n");
            current=current.next;
        }
    
    }
    
    
}

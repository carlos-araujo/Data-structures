/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Carlos
 */
public class Queue {
    Node first, last;
    
    public void enqueue(Object data){
        Node node=new Node(data);
        if(first==null){
            last=node;
            first=last;
        }else{
            last.next=node;
            last=last.next;            
        }
    }
    
    public Object dequeue(){
        if(first!=null){
            Object value=first.data;
            first=first.next;
            return value;
        }
        return null;
    }
    
    
    public void print(){
        if(first==null){
            System.out.print("Queue is empty!");
            return;
        }
        
        Node current=first;
        
        while(current!=null){
            System.out.print(current.data);
            if(current.next!=null) System.out.print(" -> ");
            current=current.next;
        }
    }
    
    
}

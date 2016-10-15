/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

/**
 *
 * @author Carlos
 */
public class LinkedList {
    Node head;
    int size;
    
    public LinkedList(){
        this.head=null;
        this.size=0;
        
    }
    
    public void add(Object data){
        Node value=new Node(data);
        Node current=head;
        
        if(size==0){
            head=value;
            size++;
            return;
        }
        
        while(current.next!=null){
            current=current.next;
        }
        
        current.next=value;
        size++;
    }
    
    
    public void remove(int index){
        if(size==0){
            System.out.println("List is empty!");
            return;
        }
        
        if(index>size-1||index<0){
            System.out.println("Invalid index!");
            return;
        }
        
        if(index==0){
            head=head.next;
            size--;
        }else{
            Node current=head;
            
            for (int i = 1; i < index; i++) {
                current=current.next;
            }
            
            current.next=current.next.next;
            
            
        }
    }
    
    
    public String toString() {
    StringBuilder builder = new StringBuilder();

    Node current = head;
    while ( current != null ) {
        builder.append("[" + current.data + "]");
        current = current.next;
    }

    return builder.toString();
}
    
}

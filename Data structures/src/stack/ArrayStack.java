/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Carlos
 */
public class ArrayStack {
    int[] stack;
    int top;
    int size;

    public ArrayStack(int size) throws Exception {
        if (size <=0) throw new Exception("Invalid size");
        
        this.stack= new int[size];
        this.top=-1;
        this.size=size;
                
    }
    
    public void push(int data) throws Exception{
        if(top==size-1) throw new Exception("Stack is full");
        
        top++;
        stack[top]=data;
        
    }
    
    public int pop() throws Exception{
        if(top<0) throw new Exception("Stack is empty");
        int value=stack[top];
        //stack[top]=null;
        top--;
        return value;      
    }
            
    public int peek(){
        return stack[top];
    }
    
    public void printStack() throws Exception{
        if(top<0) throw new Exception("Stack is empty!");
        for (int i = 0; i <= top; i++) {
            System.out.print("| "+stack[i]+" |\n");
        }
        
    
    }
    
}

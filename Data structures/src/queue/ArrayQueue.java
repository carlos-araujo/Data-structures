/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Carlos
 */
public class ArrayQueue {

    Object[] queue;
    int last, size, currentSize;

    public ArrayQueue(int size) {
        this.queue = new Object[size];
        //this.first=-1;
        this.last = -1;
        this.size = size;
        this.currentSize = 0;

    }

    public void enqueue(Object data) {
        if (currentSize == size) {
            System.out.println("Queue is full!");
            return;
        }
        last++;
        queue[last] = data;
        currentSize++;
    }
    
    public Object dequeue(){
        if(currentSize==0){
            System.out.println("Queue is empty!");
            return null;
        }
        Object temp=queue[0];
        
        for (int i = 0; i < currentSize; i++) {
            queue[i]=queue[i+1];
        }
        queue[last]=null;
        last--;
        currentSize--;
        return temp;
    }
}

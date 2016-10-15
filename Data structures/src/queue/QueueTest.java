package queue;

/**
 *
 * @author Carlos
 */
public class QueueTest {
    
    public static void main(String[] args) {
        Queue queue=new Queue();
        
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        
        queue.print();
        System.out.println("");
        
        queue.dequeue();
        
        queue.print();
        System.out.println("");
        queue.dequeue();
        queue.print();
        System.out.println("");
        queue.dequeue();
        queue.print();
        System.out.println("");
        queue.dequeue();
        queue.print();
        System.out.println("");
        queue.dequeue();
        queue.print();
        
    }
    
}

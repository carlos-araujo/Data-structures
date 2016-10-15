
package linkedlists;

/**
 *
 * @author Carlos
 */
public class LLTest {
    
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        
        System.out.println(list.toString());
        
        list.remove(0);
        System.out.println(list.toString());
        list.remove(3);
        System.out.println(list.toString());
        list.remove(9);
        System.out.println(list.toString());
        
    }
    
}

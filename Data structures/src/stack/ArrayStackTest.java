package stack;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ArrayStackTest {

    public static void main(String[] args) {

        try {

            ArrayStack stack = new ArrayStack(3);

            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.printStack();

            stack.pop();
            stack.printStack();
            stack.pop();
            stack.printStack();
            stack.pop();
            stack.printStack();
            stack.pop();


        } catch (Exception ex) {
            Logger.getLogger(StackTest.class.getName()).log(Level.SEVERE, null, ex);
        }



    }
}

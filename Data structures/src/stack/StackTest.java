/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class StackTest {
    
    public static void main(String[] args) {
        Stack stack=new Stack();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        try {
            stack.printStack();
        } catch (Exception ex) {
            Logger.getLogger(StackTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
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

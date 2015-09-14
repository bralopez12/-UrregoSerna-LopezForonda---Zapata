/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

/**
 *
 * @author Bran PC
 */
public class LinkedStack<E> implements Stack<E>{

    LinkedList pila;
    int size;

    public LinkedStack() {
        pila = new LinkedList();
        size = -1;
    }
    
    
    
    @Override
    public boolean isEmpty() {
        if (size == -1) {
            return true;
        } 
        
            return false;
        
    }

    @Override
    public E peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void push(E target) {
        size++;
        pila.addEnd(target);
    }
    
    public Object getsize(){
        return pila.end.item;
    }

}

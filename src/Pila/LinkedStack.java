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
public class LinkedStack implements Stack{

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
    public String peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String pop() {
        String datos = null;
        if (!isEmpty()) {

            pila.eliminar();
            size--;
        }

        return datos;
    }

    @Override
    public void push(String target) {
        size++;
        pila.addFinal(target);
    }
    
     public String getCima(){
        return pila.end.item;
    }

}

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
public interface Stack<E> {
    
    
    boolean isEmpty();
    
    E peek();
    
    E pop();
    
    
    
    void push(E target);
    
}

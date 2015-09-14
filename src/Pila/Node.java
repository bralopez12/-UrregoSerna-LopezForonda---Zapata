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
class Node<E> {

   Node next;
    E item;

    Node(E dato) {
        this.item=dato;
    }

    public Node getNext() {
        return next;
    }

    public E getItem() {
        return item;
    }
    
}

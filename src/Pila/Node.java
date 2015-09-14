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
class Node {

   Node next;
    String item;

    Node(String dato) {
        this.item=dato;
    }

    public Node getNext() {
        return next;
    }

    public String getItem() {
        return item;
    }
    
}

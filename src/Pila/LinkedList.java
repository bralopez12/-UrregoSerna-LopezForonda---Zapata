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
class LinkedList {
    
     public Node getTop() {
        return top;
    }

     
    public Node getEnd() {
        return end;
    }

    // Almacena inicio y final en la lista;
    Node top, end;
    
    int tamaño;

   // Agrega un nuevo nodito 
    public void addFinal(String dato) {
        Node node = new Node(dato);
        if (top == null) {
            top = node;
            end = node;
            tamaño++;
        } else {
            end.next = node;
            end = node;
            tamaño++;
        }
    }

    //Elimina un nodo
      public void eliminar() {

        if (tamaño == 1) {
            top = null;
            end = null;
            tamaño--;
        } else {
            Node aux = top;
            while (aux.next != end) {
                aux = aux.next;
            }
            end = aux;
            end.next = null;
            tamaño--;
        }

    }
  


}

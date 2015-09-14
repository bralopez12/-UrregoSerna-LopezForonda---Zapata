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
class LinkedList<E> {
    
        public Node getTop() {
        return top;
    }

    public Node getEnd() {
        return end;
    }

    Node top, end;//almena las referencias del inicio y el final de la lista
    int tamaño;//almacena el numero de elementos en la lista

  
    public void addEnd(E dato) {
        Node nodo = new Node(dato);
        if (top == null) {
            top = nodo;
            end = nodo;
            tamaño++;
        } else {
            end.next = nodo;
            end = nodo;
            tamaño++;
        }
    }

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

    public void imprimir() {
        Node aux = top;
        while (aux != null) {
            System.out.println(aux.item);
            aux = aux.next;
        }
    }

    /**
     * vacia la lista enlazad simle
     */
    public void vaciarLista() {
        top = null;
        end = null;
        tamaño=0;
    }

   

    
}

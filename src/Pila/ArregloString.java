/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

/**
 *
 * @author Bran PC
 * La expresión infija es la que ingresa el usuario
 */
public class ArregloString {
     public String[] pasarString_a_un_arreglo(String expresionInfija) {

         // Se mete todo el texto de TextField Resultado en un arreglo 
        String[] a = expresionInfija.split("");
        
        // lista de operadores
        LinkedList r =new LinkedList();
        String aux = "";

        
        // Acá es donde se separan los números y los operadores
        for (int i = 0; i < a.length; i++) {
            
            // Si es un operador ingreselo a la lista : Brayan L.
            if (this.operador(a[i])) {

                if (!aux.equals("")) {
                    r.addFinal(aux);
                    aux = "";
                }
                r.addFinal(a[i]); //agregamos el operador a la lista : Brayan L.

                // Si no es un operador entonces junte los numeros y agreguelos a la lista : Brayan L.
            } else {
                aux += a[i];
            }
            if (i == a.length - 1 && !this.operador(a[i])) {
                r.addFinal(aux);
                aux = "";
            }
        }
        
        
        //copiamos la linkedlist a un arreglo
        Node p=r.top;  
        String arreglo[]=new String[r.tamaño];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=p.item;
            p=p.next;
        }
        
        
        return arreglo;
    }

   // Comprueba si es un operador
    private boolean operador(String a) {
        boolean respuesta = false;
        if (a.equals("(") || a.equals(")") || a.equals("+") || a.equals("-")
                || a.equals("*") || a.equals("/")) {
            respuesta = true;
        }
        return respuesta;
    }
}

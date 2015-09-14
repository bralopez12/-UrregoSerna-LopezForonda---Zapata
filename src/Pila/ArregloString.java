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
public class ArregloString {
     public String[] pasarString_a_un_arreglo(String expresionInfija) {
        // TODO code application logic here

        String[] a = expresionInfija.split("");//almacena el string expresionInfija en un arreglo
        
        
        LinkedList r=new LinkedList();//cremos una lista enlazada simple en donde se almacenara los caracteres de la expresionInfija ingresada
        String aux = "";

        for (int i = 0; i < a.length; i++) {
            if (this.operador(a[i])) {// si el caracter leido es un operando

                if (!aux.equals("")) {//si el suxiliar NO esta vacio
                    r.addFinal(aux);//agregamos el aux a la lista
                    aux = "";//como ya se agrego el aux a la lista volvemos a su valor por defecto
                }
                r.addFinal(a[i]); //agregamos el operador a la lista

            } else {
                aux += a[i];//acumulamos el auxiliar, es decir si el caracter anterior era 4 y el actual es 5
                //entonces aux="45"
            }
            if (i == a.length - 1 && !this.operador(a[i])) {//validamos que ya estamos en el final de la lista y ademas el caracter leido no es un operador
                r.addFinal(aux);//agregamos el aux a la lista
                aux = "";
            }
        }//fin del for
        
        
        //copiamos la lista enlazada a un arreglo
        Node p=r.top;  
        String arreglo[]=new String[r.tamaño];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=p.item;
            p=p.next;
        }
        
        
        return arreglo;//retornamos el arreglo con los caracteres almacenados
    }

    /**
     * valida si un caracter es un operador "(,),+,-,*,/,^"
     * @param a
     * @return retorna true si el parametro a es un operador
     */
    private boolean operador(String a) {
        boolean respuesta = false;
        if (a.equals("(") || a.equals(")") || a.equals("+") || a.equals("-")
                || a.equals("*") || a.equals("/") || a.equals("^")) {
            respuesta = true;
        }
        return respuesta;
    }
}

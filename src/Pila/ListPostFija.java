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
public class ListPostFija<E> {
    
    LinkedStack p = new LinkedStack();//sera la pila de los operadores
    LinkedList expresion = new LinkedList();//alamcenara  la expresion postfija
    
   
    public String[] infijo_A_postFijo(String arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (this.operador(arreglo[i])) {
                if (arreglo[i].equals("(")) {//si el caracter es parentesis izquierdo
                    p.push(arreglo[i]);//agregamos el el parentesis izquierdo a la pila
                } else if (arreglo[i].equals(")")) {//si el caracter es parentesis derecho
                    // desplegamos el elemento cima de la pila a la expresion hasta que el 
                    //elemento de la cima n sea parantesis izquierdo
                    //(el parentesis izquierdo nose incluye en la expresion
                    while (!p.isEmpty() && !p.getCima().equals("(")) {
                        expresion.addFinal(p.getCima());//agregamos el elemento cima  a la expresion
                        p.pop();
                    }
                    p.pop();//desplegamos el parentesis izquierdo pero no lo agregamos a la expresion
                } 
                //si la pila esta vacia o la precedencia del caracter es mayor que el elemento de la cima de la pila
                else if (p.isEmpty() || precedencia(arreglo[i]) > precedencia(p.getCima())) {
                    p.push(arreglo[i]);//agregamos el operador a la pila
                } else {
                    //repetimos el procedimiento hasta que la pila no este vacia 
                    // o la preedencia del caracter es menor o igual que el elemento de la cima de la pila
                    while (!p.isEmpty() && precedencia(arreglo[i]) <= precedencia(p.getCima())) {
                        expresion.addFinal(p.getCima());//agregamos el elemento cima  a la expresion
                        p.pop();//desplegamos el elemento cima de la pila

                    }
                    p.push(arreglo[i]);//agregamos el operador a la pila
                }

            } else {// si no es un operador entonces es un real
                expresion.addFinal(arreglo[i] );//agregamos el real a la expresion
            }
        }//fin for i

        //cuando ya se ha terminado de evaluar los caracteres del arreglo
       //pasamos a agregar los elementos sobrantes de la pila a la expresion
        while (!p.isEmpty()) {//mientras haya elementos en la pila
            if (!p.getCima().equals("(")) {//no se incluye en la expresion el parentesis izquierdo
                 expresion.addFinal(p.getCima());//agregamos el elemento cima  a la expresion
            }
            p.pop();//desplegamos el elemento cima de la pila
        }
        
        //copiamos la lista enlazada simple a un arreglo
        String expresionPostfija[]=new String[expresion.tamaño];
        
         Node p=expresion.top;  
        for (int i = 0; i < expresionPostfija.length; i++) {
            expresionPostfija[i]=p.item;
            p=p.next;
        }
        return expresionPostfija;//retorna la expresion postfija
    }

    /**
     * valida si un caracter es un operador "(,),+,-,*,/,^"
     *
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

    /**
     * evalua el nivel de precedencia de un caracter y retorna un valor numerico
     * asocido a este
     *
     * @param op parametro al cual le sera asignado un valor numerico
     * @return
     */
    private int precedencia(String op) {
        int prf = 99;
        if (op.equals("^")) {
            prf = 5;
        }
        if (op.equals("*") || op.equals("/")) {
            prf = 4;
        }
        if (op.equals("+") || op.equals("-")) {
            prf = 3;
        }

        if (op.equals("(")) {
            prf = 1;
        }
        return prf;
    }
 
}

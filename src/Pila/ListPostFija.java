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
    
    LinkedStack p = new LinkedStack();
    
    // Aca se guarda la expresion postfija que es la que opera
    LinkedList expresion = new LinkedList();
    
   
    public String[] infijo_A_postFijo(String arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (this.operador(arreglo[i])) {
                if (arreglo[i].equals("(")) {
                    // Aca se agrega el parentesis izquierdo( El derecho no se ingresa ) : Brayan L.
                    p.push(arreglo[i]);
                } else if (arreglo[i].equals(")")) {
                    
                    while (!p.isEmpty() && !p.getCima().equals("(")) {
                        expresion.addFinal(p.getCima());
                        p.pop();
                    }
                    p.pop();
                } 
                else if (p.isEmpty() || precedencia(arreglo[i]) > precedencia(p.getCima())) {
                    p.push(arreglo[i]);
                } else {
                   
                    //este while se repite hasa que la pila este vacia
                    while (!p.isEmpty() && precedencia(arreglo[i]) <= precedencia(p.getCima())) {
                        expresion.addFinal(p.getCima());
                        p.pop();

                    }
                    p.push(arreglo[i]);
                }

            } else {
                expresion.addFinal(arreglo[i] );//agregamos el real a la expresion : Brayan l
            }
        }

    
        while (!p.isEmpty()) {
            if (!p.getCima().equals("(")) {
                 expresion.addFinal(p.getCima());
            }
            p.pop();
        }
        
       
        String expresionPostfija[]=new String[expresion.tamaño];
        
         Node p=expresion.top;  
        for (int i = 0; i < expresionPostfija.length; i++) {
            expresionPostfija[i]=p.item;
            p=p.next;
        }
        return expresionPostfija;//retorna la expresion postfija
    }

    //comprueba Si es un operador
    private boolean operador(String a) {
        boolean respuesta = false;
        if (a.equals("(") || a.equals(")") || a.equals("+") || a.equals("-")
                || a.equals("*") || a.equals("/") ) {
            respuesta = true;
        }
        return respuesta;
    }

    
    // saber que operador es
    private int precedencia(String op) {
        int prf = 99;
       
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

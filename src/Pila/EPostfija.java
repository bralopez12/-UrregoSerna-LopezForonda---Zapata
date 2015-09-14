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
public class EPostfija {
    
      public String evaluarExpresion(String arregloPostFijo[]) {
        LinkedStack p = new LinkedStack();//creamos una pila
       
        //mientras haya elementos en el arregloPostFijo
        for (int i = 0; i < arregloPostFijo.length; i++) {
            if (operador(arregloPostFijo[i])) {//si el elemto del arreglo es un operador
                //el algoritmo nos dice que debemos quitar los dos elemtos de la cima de la pila realizar la operacion que corresponde al operador
                //y agregar ese nuevo resultado a la pila
                //ejemplo el operador es l "-" ,y  b esta en la cima y luego le sigue a, entonces se agregaria a la pila a-b

                String b = p.getCima();
                p.pop();//quitamos el elemeto de la cima
                String a = p.getCima();
                p.pop();//quitamos el elemeto de la cima
                
                if (arregloPostFijo[i].equals("+")) {
                   double a_b= Double.parseDouble(a)+Double.parseDouble(b);
                    p.push(Double.toString(a_b));//agregamos a la pila el resultado de  " a oprador b"
                }
                if (arregloPostFijo[i].equals("-")) {
                   double a_b= Double.parseDouble(a)-Double.parseDouble(b);
                    p.push(Double.toString(a_b));//agregamos a la pila el resultado de  " a oprador b"
                }
                if (arregloPostFijo[i].equals("*")) {
                   double a_b= Double.parseDouble(a)*Double.parseDouble(b);
                    p.push(Double.toString(a_b));//agregamos a la pila el resultado de  " a oprador b"
                }
                if (arregloPostFijo[i].equals("/")) {
                   double a_b= Double.parseDouble(a)/Double.parseDouble(b);
                    p.push(Double.toString(a_b));//agregamos a la pila el resultado de  " a oprador b"
                }
                 if (arregloPostFijo[i].equals("^")) {
                   double a_b=Math.pow(Double.parseDouble(a), Double.parseDouble(b));
                     
                    p.push(Double.toString(a_b));//agregamos a la pila el resultado de  " a oprador b"
                }
                
                //en la instruccion anterior note se convierte el double en String   eso es porque nuestra pila es de Strings
            } else {
                p.push(arregloPostFijo[i]);//agregamos el numero a la pila
            }
        }

        //cuando ya se ha terminado de evaluar la expresion postfija la respuesta es elemeto restante de la pila
        return p.getCima();
    }

    /**
     * valida si un caracter es un operador "(,),+,-,*,/,^"
     *
     * @param a
     * @return retorna true si el parametro a es un operador
     */
    private boolean operador(String a) {
        boolean respuesta = false;
        if (a.equals("+") || a.equals("-")
                || a.equals("*") || a.equals("/") || a.equals("^")) {
            respuesta = true;
        }
        return respuesta;
    }
  
}

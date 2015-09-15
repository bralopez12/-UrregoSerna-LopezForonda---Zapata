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
          // Se crea una pila
        LinkedStack p = new LinkedStack();
       
       
        for (int i = 0; i < arregloPostFijo.length; i++) {
            
            // Si la posicion del postfijo es un operador entonces.. : Brayan L.
            if (operador(arregloPostFijo[i])) {
                
                String b = p.getCima();
                //quitamos el elemeto de la cima. Brayan L.
                p.pop();
                String a = p.getCima();
                p.pop();
                
                
                //AGREGAMOS ALA PILA EL REULTADO DE a operador b : Brayan L.
                // Se Convierte de double a String porque la pila es de STRING : Brayan L.
                if (arregloPostFijo[i].equals("+")) {
                   double a_b= Double.parseDouble(a)+Double.parseDouble(b);
                    p.push(Double.toString(a_b));
                }
                if (arregloPostFijo[i].equals("-")) {
                   double a_b= Double.parseDouble(a)-Double.parseDouble(b);
                    p.push(Double.toString(a_b));
                }
                if (arregloPostFijo[i].equals("*")) {
                   double a_b= Double.parseDouble(a)*Double.parseDouble(b);
                    p.push(Double.toString(a_b));
                }
                if (arregloPostFijo[i].equals("/")) {
                   double a_b= Double.parseDouble(a)/Double.parseDouble(b);
                    p.push(Double.toString(a_b));
                }
                
                
                
            } else {
                
                // Acá se agrega el número a la pila
                p.push(arregloPostFijo[i]);
            }
        }

       
        return p.getCima();
    }

   
      
      // Este Metodo Verifica sí es un operador : Brayan L-
    private boolean operador(String a) {
        boolean respuesta = false;
        if (a.equals("+") || a.equals("-")
                || a.equals("*") || a.equals("/") ) {
            respuesta = true;
        }
        return respuesta;
    }
  
}

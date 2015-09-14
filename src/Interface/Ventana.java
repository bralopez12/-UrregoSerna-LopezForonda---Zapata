
package Interface;

import Pila.ArregloString;
import Pila.EPostfija;
import Pila.ListPostFija;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 *
 * @author Juan Camilo
 */
public class Ventana extends JFrame implements ActionListener {
JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bigual, bDEL, bCE, bpunto, bpa, bpc, bm, bd, bs, br, ima;
JTextField Resultado;
JPanel Panel;
ImageIcon logos = new ImageIcon(getClass().getResource("/Imagenes/logo.png"));
ImageIcon logo = new ImageIcon(getClass().getResource("/Imagenes/calculadora.png"));
JLabel m1;




    public Ventana() throws HeadlessException {
        super("Calculadora");
        int resultado = 325;
        int x = resultado/5;//65
        int y = 65; //75-81.25
        int a = resultado/(resultado/50);
        int l = a;
        int i = 125;
        Container contenedor = getContentPane();
        m1 = new JLabel("CALCULADORA INFIJA CON PILAS");
        ima = new JButton(logos);
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bigual = new JButton("=");
        bDEL = new JButton("DEL");
        bCE = new JButton("AC");
        bpunto = new JButton(".");
        bpa = new JButton("(");
        bpc = new JButton(")");
        bm = new JButton("*");
        bd = new JButton("/");
        bs = new JButton("+");
        br = new JButton("-");
        Resultado = new JTextField();
        Panel = new JPanel();
        setContentPane(Panel);
        Panel.setLayout(null);
        Panel.setBackground(Color.yellow);
        Panel.setLayout(null);
        Panel.add(Resultado);
        //Configurando la posicion de los botones
        Panel.add(ima);
        ima.setBounds(x*2-20,y*6,220,220);
        m1.setBounds(x*2, 20, 190, 40);
        Panel.add(m1);
        Resultado.setBounds(65,75,resultado,35);
        Panel.add(b7);
        b7.setBounds(x,i,a,l);
        Panel.add(b8);
        b8.setBounds(x*2,i,a,l);
        Panel.add(b9);
        b9.setBounds(x*3,i,a,l);
        Panel.add(bCE);
        bCE.setBounds (x*5,i, a, l);
        Panel.add(b4);
        b4.setBounds(x,y*3,a,l);
        Panel.add(b5);
        b5.setBounds(x*2,y*3,a,l);
        Panel.add(b6);
        b6.setBounds(x*3,y*3,a,l);
        Panel.add(bpa);
        bpa.setBounds(x*4,y*3,a,l);
        Panel.add(bpc);
        bpc.setBounds(x*5,y*3,a,l);
        Panel.add(b1);
        b1.setBounds(x*1,y*4,a,l);
        Panel.add(b2);
        b2.setBounds(x*2,y*4,a,l);
        Panel.add(b3);
        b3.setBounds(x*3,y*4,a,l);
        Panel.add(bm);
        bm.setBounds(x*4,y*4,a,l);
        Panel.add(bd);
        bd.setBounds(x*5,y*4,a,l);
        Panel.add(b0);
        b0.setBounds(x*1,y*5,a,l);
        Panel.add(bpunto);
        bpunto.setBounds(x*2,y*5,a,l);
        Panel.add(bs);
        bs.setBounds(x*4,y*5,a,l);
        Panel.add(br);
        br.setBounds(x*5,y*5,a,l);
        Panel.add(bigual);
        bigual.setBounds(x*3,y*5,a,l);
        Panel.add(bDEL);
        bDEL.setBounds(x*4, i, a, l);
        
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bpunto.addActionListener(this);
        bigual.addActionListener(this);
        bd.addActionListener(this);
        bm.addActionListener(this);
        bs.addActionListener(this);
        br.addActionListener(this);
        bCE.addActionListener(this);
        bpa.addActionListener(this);
        bpc.addActionListener(this);
        bDEL.addActionListener(this);
        
        setSize(470, 640); //492 , 595
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/calculadora.png")).getImage());
    }
    
    public static void main(String[] args) {
        Ventana app = new Ventana();
        app.setResizable(false);
        app.setLocation(500, 50);
     }
    
        String expresionPostFija[] ;//almacenara en un arreglo la expresion postfija

    
    public void actionPerformed(ActionEvent ae) {
 
        
 
            switch (ae.getActionCommand()) {
 
                case "0":
                    Resultado.setText(Resultado.getText() + "0");
                    break;
 
                case "1":
                    Resultado.setText(Resultado.getText() + "1");
                    break;
                case "2":
                    Resultado.setText(Resultado.getText() + "2");
                    break;
 
                case "3":
                    Resultado.setText(Resultado.getText() + "3");
                    break;
 
                case "4":
                    Resultado.setText(Resultado.getText() + "4");
                    break;
 
                case "5":
                    Resultado.setText(Resultado.getText() + "5");
                    break;
 
                case "6":
                    Resultado.setText(Resultado.getText() + "6");
                    break;
 
                case "7":
                    Resultado.setText(Resultado.getText() + "7");
                    break;
 
                case "8":
                    Resultado.setText(Resultado.getText() + "8");
                    break;
 
                case "9":
                    Resultado.setText(Resultado.getText() + "9");
                    break;
 
                case "(":
                    Resultado.setText(Resultado.getText() + "(");
                    break;
 
                case ")":
                    Resultado.setText(Resultado.getText() + ")");
                    break;
 
                case "*":
                    Resultado.setText(Resultado.getText() + "*");
                    break;
 
                case "-":
                    Resultado.setText(Resultado.getText() + "-");
                    break;
 
                case "+":
                    Resultado.setText(Resultado.getText() + "+");
                    break;
                   
                    case ".":
                    Resultado.setText(Resultado.getText() + ".");
                    break;  
                   
                       
                           case "/":
                    Resultado.setText(Resultado.getText() + "/");
                    break;
                       
                case "AC":
                    Resultado.setText("");
                    break;
                
                case "=":
                    
                    
                        try{
            
            ArregloString m = new ArregloString();
            String arreglo[] = m.pasarString_a_un_arreglo(Resultado.getText());//pasamos a un arreglo la expresion infija ingresada
            ListPostFija obj = new ListPostFija();//creamos un objeto de la clase PostFijo para poder acceder a sus metodos y vriables

            //a*(b+c-(d/e^f)-g)-h
             
            expresionPostFija = obj.infijo_A_postFijo(arreglo);//llamamos al metodo infijo_A_postFijo el cual retorna la expresion postfija como un arreglo de strings
            String postfija = null;
            //imprimimos la expreson postfija
            for (int i = 0; i < expresionPostFija.length; i++) {
                 postfija = postfija + expresionPostFija[i];
            }
            
      
        
        
        // EVALUAR
        
          boolean accion = false;//alamacena true si la expresion postfija tinene alguna variable
        

            String a[] = expresionPostFija;//copiamos temporalmente en un arreglo la expresion postfija
            

            //si la expresion postfija no tiene ninguna variable
                EPostfija n = new EPostfija();//creamos un objeto de la clase EvaluacionPostFija
                //pasamos a evaluar la expresion postfija               
                Resultado.setText(n.evaluarExpresion(expresionPostFija));//imprime en pantalla el resultado de la evaluacion
              
           
                if(Resultado.getText().toString().equals("Infinity")){
            JOptionPane.showMessageDialog(null, "ERROR AL DIVIDIR POR CERO", "ERROR EN SINTAXIS", JOptionPane.ERROR_MESSAGE);
                Resultado.setText("");
                }
       
                        }catch(Exception E){
                                        JOptionPane.showMessageDialog(null, "Revice que los datos ingresados sean correctos", "ERROR EN SINTAXIS", JOptionPane.ERROR_MESSAGE);

                        }
                    
                    
                  
                    break;
                case "DEL":
                    if(Resultado.getText().length()!=0){
                     Resultado.setText(Resultado.getText().substring(0, Resultado.getText().length()-1));
                     }
                    
                
                   
                   
 
            }
 
        
    
    }
}

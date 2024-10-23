package Calculator;

import javax.swing.*;

public class Calculo {
 int x, y, e;


 public Calculo(){

 }

    public void askvalues (){
       this.x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x"));

       this.y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de y"));
    }


    public int suma(){
        return x+y;
    }


    public int resta(){
     return x-y;
    }


    public double divi(){
   //ver divisor
        return (double) y/x;
    }

    public int Multi(){
     return x*y;
    }


    public double potencia(double x, int e){
        return Math.pow(x, e);
    }


    public double raiz(int x){
     return Math.sqrt(x);
     //form
    }

    public int getY() {
        return y;
    }
}

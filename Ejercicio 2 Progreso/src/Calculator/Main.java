package Calculator;

import javax.swing.*;

public class Main {

    public static void main (String args[]){
String opcion;
        opcion=JOptionPane.showInputDialog("Bienvenido a tu sistema de calculadors\n"+
                "Escoje lo que desees hacer:\n 1.Sumar\n 2. Restar\n 3. Multiplicar\n 4.Dividir\n 5.Elevar a la potencia\n"+
                "6. Sacar la raiz");
        //potencias, raices


Calculo calc=new Calculo();
        switch (opcion) {
            case "1":
                calc.askvalues();
                JOptionPane.showMessageDialog(null, "Tu respuesta es "+ calc.suma());
                break;

            case "2":
                calc.askvalues();
                JOptionPane.showMessageDialog(null, "Tu respuesta es "+ calc.resta());

                break;

            case "3":
                calc.askvalues();
                JOptionPane.showMessageDialog(null, "Tu respuesta es "+  calc.Multi());

                break;

            case "4":
                calc.askvalues();
                    if(calc.getY()!=0)
                {
                    JOptionPane.showMessageDialog(null, "Tu respuesta es "+ calc.divi());
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se puede dividir para 0");
                }
                break;

            case "5":
                int base= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
                int potencia= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la potencia"));
                JOptionPane.showMessageDialog(null, "tu respuesta es "+ calc.potencia(base, potencia));

                break;

            case "6":
                int x= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la raiz cuadrada sacar"));
                JOptionPane.showMessageDialog(null, "tu respuesta es "+ calc.raiz(x));
                break;

            default:
                JOptionPane.showMessageDialog(null, "No existe esa opcion");
                break;
        }
    }
}

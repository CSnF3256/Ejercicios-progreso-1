package Objetos_Vehiculos;

import javax.swing.*;

public class Vehiculo {
    int numero_puertas;
    int numero_ventanas;
    String marca;
    String modelo;
    double kilometraje_inicial;
    double kilometraje_final;
    String motor;

    public Vehiculo(){

        this.modelo= JOptionPane.showInputDialog("Ingresa el modelo");
        this.motor= JOptionPane.showInputDialog("Ingresa el numero del motor");
        this.marca= JOptionPane.showInputDialog("Ingresa la marca");
        this.numero_puertas= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de puertas"));
        this.numero_ventanas= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de ventanas"));
        this.kilometraje_inicial = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el kilometraje inicial"));
        this.kilometraje_final = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el kilometraje final"));

    }

    public double calculokilometros (){
       return kilometraje_final-kilometraje_inicial;
    }
}

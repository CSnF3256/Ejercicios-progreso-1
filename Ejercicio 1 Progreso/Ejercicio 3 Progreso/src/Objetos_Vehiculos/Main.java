package Objetos_Vehiculos;

import javax.swing.*;
import java.io.IOException;

public class Main {
public static void main (String args[]) throws IOException {
JOptionPane.showMessageDialog(null,"Bienvenido a tu consultpr de vehiculos.\n "+
        "Ingresa los datos de tu vehiculo para luego consultar su info");


Vehiculo car1= new Vehiculo();

JOptionPane.showMessageDialog(null, "Informacion ingresada con exito");
       String op2=JOptionPane.showInputDialog("Que deseas saber:\n" +
               "1.Marca\n" +
               "2.Modelo\n" +
               "3.Numero de Motor\n" +
               "4.Numero de puertas\n" +
               "5.Numero de ventanas\n" +
               "6.Kilometraje incial\n" +
               "7.Kilometraje final\n" +
               "8.Kilometros recorridos");

       switch (op2){

           case "1":
               JOptionPane.showMessageDialog(null,"La marca es "+ car1.marca);
               break;
           case "2":
               JOptionPane.showMessageDialog(null,"La marca es "+ car1.modelo);
               break;
           case "3":
               JOptionPane.showMessageDialog(null,"La marca es "+ car1.motor);
               break;
           case "4":
               JOptionPane.showMessageDialog(null,"La marca es "+ car1.numero_puertas);
               break;
           case "5":
               JOptionPane.showMessageDialog(null,"La marca es "+ car1.numero_ventanas);
               break;
           case "6":
               JOptionPane.showMessageDialog(null,"La marca es "+ car1.kilometraje_inicial);
               break;
           case "7":
               JOptionPane.showMessageDialog(null,"La marca es "+ car1.kilometraje_final);
               break;
           case "8":
               JOptionPane.showMessageDialog(null, "Los kilómetros recorridos son: " + car1.calculokilometros());
               break;

               default:
               JOptionPane.showMessageDialog(null, "No existe esa opcion");
               break;

       }







}}
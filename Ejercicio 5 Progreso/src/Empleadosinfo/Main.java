package Empleadosinfo;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        JOptionPane.showMessageDialog(null, "Bienvenido a esta aplicación de XXXEmpresa");
        InfoEmpleado empleado1 = new InfoEmpleado();
        String op = JOptionPane.showInputDialog("¿Qué deseas hacer?\n" +
                "1. Calcular mi edad\n" +
                "2. Modificar mi salario\n" +
                "3. Calcular prestaciones");

        switch (op) {
            case "1":
                int edad = empleado1.calcularEdad();
                JOptionPane.showMessageDialog(null, "Su edad es: " + edad + " años");
                break;

            case "2":
                empleado1.modificarSalario();
                JOptionPane.showMessageDialog(null, "Su nuevo salario es: $" + empleado1.getSalarioNuevo());
                break;

            case "3":
                double prestaciones = empleado1.calcularPrestaciones();
                JOptionPane.showMessageDialog(null, "Sus prestaciones son: $" + prestaciones);
                break;

            default:
                JOptionPane.showMessageDialog(null, "No existe esa opción");
                break;
        }
    }
}


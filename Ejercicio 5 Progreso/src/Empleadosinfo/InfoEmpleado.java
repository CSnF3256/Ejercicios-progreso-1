package Empleadosinfo;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class InfoEmpleado {
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private double salario;
    private String fechaNacimiento;
    private String fechaIngreso;
    private double salarionuevo;

    public InfoEmpleado() {
        cedula = JOptionPane.showInputDialog("Ingresa tu cédula");
        nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        apellido = JOptionPane.showInputDialog("Ingresa tu apellido");
        genero = JOptionPane.showInputDialog("Ingresa tu género");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu salario"));
        fechaNacimiento = JOptionPane.showInputDialog("Ingresa tu fecha de nacimiento (DD/MM/AAAA)");
        fechaIngreso = JOptionPane.showInputDialog("Ingresa tu fecha de ingreso (DD/MM/AAAA)");
    }

    public double calcularPrestaciones() {
        int antiguedad = calcularAntiguedad();
        return (antiguedad * salario) / 12;
    }

    public void modificarSalario() {
        salarionuevo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el nuevo salario"));
        salario = salarionuevo;
    }

    public double getSalarioNuevo() {
        return salario;
    }

    public int calcularAntiguedad() {
        LocalDate fechaIngresoDate = LocalDate.parse(fechaIngreso, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return (int) ChronoUnit.YEARS.between(fechaIngresoDate, LocalDate.now());
    }

    public int calcularEdad() {
        LocalDate fechaNacimientoDate = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return (int) ChronoUnit.YEARS.between(fechaNacimientoDate, LocalDate.now());
    }
}

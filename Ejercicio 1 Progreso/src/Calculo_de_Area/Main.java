package Calculo_de_Area;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // Definir variables
        int a, b, c;
        String op;

        // Instanciar BufferedReader para la entrada de datos
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Buenos Días\n" + "Escoge la figura que deseas calcular el área y el perímetro\n"
                + "1. Triángulo\n 2. Cuadrado\n 3. Rectángulo");
        op = reader.readLine();

        CalculoAreas calculo = new CalculoAreas();

        switch (op) {
            case "1": // Triángulo
                System.out.println("Ingrese la base y la altura del triángulo:");
                a = Integer.parseInt(reader.readLine());
                b = Integer.parseInt(reader.readLine());
                System.out.println("Ingrese los otros 2 lados del triángulo:");
                c = Integer.parseInt(reader.readLine());
                int lado3 = Integer.parseInt(reader.readLine());

                calculo.Trianglearea(a, b);
                calculo.Triangleperimeter(a, c, lado3);
                System.out.println("Área del triángulo: " + calculo.getArea());
                System.out.println("Perímetro del triángulo: " + calculo.getPerimeter());
                break;

            case "2": // Cuadrado
                System.out.println("Ingrese el lado del cuadrado:");
                c = Integer.parseInt(reader.readLine());

                calculo.Squarearea(c);
                calculo.Squareperimeter(c);
                System.out.println("Área del cuadrado: " + calculo.getArea());
                System.out.println("Perímetro del cuadrado: " + calculo.getPerimeter());
                break;

            case "3": // Rectángulo
                System.out.println("Ingrese el largo y el ancho del rectángulo:");
                a = Integer.parseInt(reader.readLine());
                b = Integer.parseInt(reader.readLine());

                calculo.Rectanglearea(a, b);
                calculo.Rectangleperimeter(a, b);
                System.out.println("Área del rectángulo: " + calculo.getArea());
                System.out.println("Perímetro del rectángulo: " + calculo.getPerimeter());
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
}


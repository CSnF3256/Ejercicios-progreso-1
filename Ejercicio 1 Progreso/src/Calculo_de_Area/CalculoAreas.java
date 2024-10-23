package Calculo_de_Area;

public class CalculoAreas {

    private int area = 0;
    private int perimeter = 0;

    // Cálculo del área del triángulo
    public void Trianglearea(int base, int altura) {
        area = (base * altura) / 2;
    }

    // Cálculo del perímetro del triángulo
    public void Triangleperimeter(int lado1, int lado2, int lado3) {
        perimeter = lado1 + lado2 + lado3;
    }

    // Cálculo del área del cuadrado
    public void Squarearea(int lado) {
        area = lado * lado;
    }

    // Cálculo del perímetro del cuadrado
    public void Squareperimeter(int lado) {
        perimeter = 4 * lado;
    }

    // Cálculo del área del rectángulo
    public void Rectanglearea(int largo, int ancho) {
        area = largo * ancho;
    }

    // Cálculo del perímetro del rectángulo
    public void Rectangleperimeter(int largo, int ancho) {
        perimeter = 2 * (largo + ancho);
    }

    public int getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }
}

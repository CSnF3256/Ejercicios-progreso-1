package Productos_con_Iva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mean {

    public static void main (String args[]) throws IOException {
        //Pedir usuario que ingrese productos
        //Pedir la cantidad
        //pedir precio
        //Mostrar el total del precio general y final segun el producto que quiera


        String nombre;
        int cantidad;
        double precio;

        BufferedReader CS =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Deseas ingresar un producto? (1. yes / 2. no)");
        int r= Integer.parseInt(CS.readLine());

        while (r==1) {
            System.out.println("Ingresa el nombre del producto");
            nombre= CS.readLine();
            System.out.println("Ingresa el precio del producto");
            precio= Double.parseDouble(CS.readLine());
            System.out.println("Ingresa la cantidad del producto comprado");
            cantidad= Integer.parseInt(CS.readLine());

            IVA iva = new IVA();
           double IVAprice= iva.PrecioconIVA(precio);
           double totalPago= iva.totalapagar(IVAprice, cantidad);
           System.out.println("El precio de" +nombre +"con Iva es"+ IVAprice);
           System.out.println("El precio total a pagar de todos los "+nombre + "con Iva es"+ totalPago);

            System.out.println("Deseas ingresar otro producto? (1. yes / 2. no)");
            r= Integer.parseInt(CS.readLine());
        }

       if (r==2){
           System.out.println("Nos vemos una proxima vez bye!");
       }



    }
}

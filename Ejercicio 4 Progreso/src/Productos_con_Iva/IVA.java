package Productos_con_Iva;

public class IVA {

//Si el producto no tiene IVA, en ese caso el valor seria 0
//• Los productos que tienen IVA si el valor es menor o igual a 500 es el 12%.
//• Los productos que tienen IVA si es mayor a 500 y menor o igual a 1500 es el 14%.
//• Los productos que tienen IVA si es mayor a 1500 es el 15%.

    double precioconIva;
    double precio1;

    public double PrecioconIVA (double precio1){

        if (precio1==0){
            precioconIva=0;
        }
        else if(precio1>0||precio1<=500)
        {
            precioconIva=precio1+(precio1*0.12);
        }
        else if(precio1>500||precio1<=1500)
        {
            precioconIva=precio1+(precio1*0.14);
        }
        else if (precio1>1500)
        {
            precioconIva=precio1+(precio1*0.15);
        }

        return precioconIva;
    }

    public double totalapagar(double precioconiva,int cantidad ){
        double total= precioconIva * cantidad;



        return total;
    }

}

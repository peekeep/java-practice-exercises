import java.util.Scanner;

public class clienteTotalCompra {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double precio1, precio2, precioFinal1, precioFinal2, cantidad1, cantidad2;

        System.out.println("Ingrese el precio del primer producto: ");
        precio1 = sc.nextDouble();

        System.out.println("Ingrese el precio del segundo producto: ");
        precio2 = sc.nextDouble();

        System.out.println("Ingrese la cantidad del primer producto: ");
        cantidad1 = sc.nextDouble();

        System.out.println("Ingrese la cantidad del segundo producto: ");
        cantidad2 = sc.nextDouble();

        precioFinal1 = calcularMonto(precio1, cantidad1);
        precioFinal2 = calcularMonto(precio2, cantidad2);
        
        System.out.println("El total de la compra es de: "+(precioFinal1+precioFinal2));

        sc.close();
    }

    public static double calcularMonto(double precio, double cantidad) {

        double precioFinal, precioDescuento, subTotal;
        subTotal = precio * cantidad;
        precioDescuento = subTotal * 0.25;
        precioFinal = subTotal - precioDescuento;
        return precioFinal;
    }
}
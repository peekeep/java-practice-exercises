import java.util.Scanner;

public class clientePago {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double precio, precioFinal1, precioFinal2, precioFinal3, porcentajeDescuento;

        System.out.println("Ingrese el precio del primer producto: ");
        precio = sc.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: ");
        porcentajeDescuento = sc.nextInt();

        precioFinal1 = calcularMonto(precio, porcentajeDescuento);

        System.out.println("Ingrese el precio del segundo producto: ");
        precio = sc.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: ");
        porcentajeDescuento = sc.nextInt();

        precioFinal2 = calcularMonto(precio, porcentajeDescuento);

        System.out.println("Ingrese el precio del tercer producto: ");
        precio = sc.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: ");
        porcentajeDescuento = sc.nextInt();

        precioFinal3 = calcularMonto(precio, porcentajeDescuento);
        
        System.out.println("El precio del primer producto es de: $"+precioFinal1+"\n"
        +"El precio del segundo producto es de: $"+precioFinal2+"\n"
        +"El precio del tercer producto es de: $"+precioFinal3);

        sc.close();
    }

    public static double calcularMonto(double precio, double porcentajeDescuento) {

        double precioDescuento, precioFinal;
        precioDescuento = precio * (porcentajeDescuento/100);
        precioFinal = precio - precioDescuento;
        return precioFinal;
    }
}
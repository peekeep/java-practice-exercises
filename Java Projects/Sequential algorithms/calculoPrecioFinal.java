import java.util.Scanner;

public class calculoPrecioFinal {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double precioBase, precioFinal;
        int porcentajeDescuento, porcentajeIVA;

        System.out.println("Ingresar el precio base de su producto: ");
        precioBase = sc.nextDouble();

        System.out.println("Ingresar el porcentaje de descuento: ");
        porcentajeDescuento = sc.nextInt();

        System.out.println("Ingresar el porcentaje de IVA: ");
        porcentajeIVA = sc.nextInt();

        double montoDescuento = precioBase * porcentajeDescuento/ 100;
        double precioConDescuento = precioBase - montoDescuento;
        double montoIVA = precioConDescuento * porcentajeIVA/ 100;
        precioFinal = precioConDescuento + montoIVA;

        System.out.printf("El precio final es de $%.2f\n", precioFinal);

        sc.close();
     }
}
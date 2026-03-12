import java.util.Scanner;

public class generacionReciboCompra {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nombreProducto;
        double precioUnitario, montoTotal, porcentajeIVA, subTotal, impuesto;
        int cantidad;

        System.out.println("Ingrese el nombre del producto: ");
        nombreProducto = sc.nextLine();

        System.out.println("Ingrese el precio unitario: ");
        precioUnitario = sc.nextDouble();

        System.out.println("Ingrese la cantidad de productos: ");
        cantidad = sc.nextInt();

        System.out.println("Ingrese el porcentaje de IVA de su pais: ");
        porcentajeIVA = sc.nextDouble();

        subTotal = precioUnitario * cantidad;
        impuesto = subTotal * (porcentajeIVA/100);
        montoTotal = subTotal + impuesto;

        System.out.println("\n----- RECIBO DE COMPRA -----");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + subTotal);
        System.out.println("IVA (" + porcentajeIVA + "): $" + impuesto);
        System.out.println("Total a pagar: $" + montoTotal);

        sc.close();
    }
}
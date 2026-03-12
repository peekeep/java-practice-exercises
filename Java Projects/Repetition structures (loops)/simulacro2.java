import java.util.Scanner;

public class simulacro2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double precio, totalPorProducto, total;
        int cantKilo, totalKilo, mayorCantKilo;
        String formaPago, continuar;
        total = 0;
        totalKilo = 0;
        mayorCantKilo = 0;

        do {
            System.out.println("Ingrese la cantidad de kilos a comprar: ");
            cantKilo = sc.nextInt();
            System.out.println("Ingrese el precio por kilo: ");
            precio = sc.nextDouble();
            System.out.println("¿Cual es su forma de pago?");
            formaPago = sc.next().toLowerCase();
            totalKilo = totalKilo + cantKilo;
            totalPorProducto = calcularImporte(cantKilo, precio, formaPago);
            System.out.println("El total del producto es de: "+totalPorProducto);
            total = total + totalPorProducto;
            totalPorProducto = 0;
            if (mayorCantKilo<cantKilo) {
                mayorCantKilo=cantKilo;
            }
            System.out.println("¿Desea continuar?");
            continuar = sc.next().toLowerCase();
        }
        while (!continuar.equals("si"));
        System.out.println("El total de la compra es de: "+total);
        System.out.println("El total de kilos es de: "+totalKilo);
        System.out.println("La mayor cantidad de kilos es de: "+mayorCantKilo);
    }

    public static double calcularImporte(int cantKilo, double precio, String formaPago) {
        double importe = precio * cantKilo;
        if (cantKilo>3 || formaPago=="efectivo") {
            importe = importe * 0.80;
        }
        return importe;
    }
}
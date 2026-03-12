import java.util.Scanner;

public class sumaTotalCompra {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

      double producto1, producto2, producto3, montoTotal;

      System.out.println("Ingrese el precio del primer producto: ");
      producto1 = sc.nextDouble();

      System.out.println("Ingrese el precio del segundo producto: ");
      producto2 = sc.nextDouble();

      System.out.println("Ingrese el precio del tercer producto: ");
      producto3 = sc.nextDouble();

      montoTotal = producto1 + producto2 + producto3;

      System.out.printf("El monto final es de $%.2f\n", montoTotal);

      sc.close();
    }
}
import java.util.Scanner;

public class calculoSueldoFinal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int sueldoBase, bonificacion, descuentos, sueldoNeto;

        System.out.println("Ingrese el sueldo base de su empleado: ");
        sueldoBase = sc.nextInt();

        System.out.println("Ingrese la bonificacion fija de su empleado: ");
        bonificacion = sc.nextInt();

        System.out.println("Ingrese el monto de descuentos de su empleado: ");
        descuentos = sc.nextInt();

        sueldoNeto = sueldoBase + bonificacion - descuentos;
        System.out.println("El sueldo neto de su empleado es de $" +sueldoNeto);

        sc.close();
    }
}
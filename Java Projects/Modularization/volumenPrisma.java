import java.util.Scanner;

public class volumenPrisma {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double base, altura, profundidad, volumen;

        System.out.println("Ingrese la base de su prisma rectangular: ");
        base = sc.nextDouble();

        System.out.println("Ingrese la altura de su prisma rectangular: ");
        altura = sc.nextDouble();

        System.out.println("Ingrese la profundidad de su prisma rectangular: ");
        profundidad = sc.nextDouble();

        volumen = calculoVolumen(base, altura, profundidad);

        System.out.println("El volumen de su prisma rectangular es de: "+volumen);

        sc.close();
    }

    public static double calculoVolumen(double base, double altura, double profundidad) {
        double volumen;
        volumen = base * altura * profundidad;
        return volumen;
    }
}
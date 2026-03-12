import java.util.Scanner;

public class volumenCajaRectangular {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double largo, ancho, altura, volumen;

        System.out.println("Ingrese el largo de su caja rectangular en cm: ");
        largo = sc.nextDouble();

        System.out.println("Ingrese el ancho de su caja rectangular en cm: ");
        ancho = sc.nextDouble();

        System.out.println("Ingrese la altura de su caja rectangular en cm: ");
        altura = sc.nextDouble();

        volumen = calculoVolumen(largo, ancho, altura);

        System.out.println("El volumen en metros de su caja rectangular es de: "+volumen);

        sc.close();
    }

    public static double calculoVolumen(double largo, double ancho, double altura) {
        double volumen;
        volumen = (largo * ancho * altura)/1000000;
        return volumen;
    }
}
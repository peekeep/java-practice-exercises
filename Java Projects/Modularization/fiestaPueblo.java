import java.util.Scanner;

public class fiestaPueblo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double diametro, cantidadVueltas;

        System.out.println("Ingrese el diametro de su columna en cm: ");
        diametro = sc.nextDouble();

        cantidadVueltas = calculoVueltas(diametro);

        System.out.printf("La cantidad de vueltas que puede darle a la columna es de: %.2f\n", cantidadVueltas);

        sc.close();
    }

    public static double calculoVueltas(double diametro) {
        double cantidadVueltas, tiraLuces, perimetro;
        tiraLuces = 2000.0;
        perimetro = Math.PI * diametro;
        cantidadVueltas = tiraLuces / perimetro;
        return cantidadVueltas;
    }
}
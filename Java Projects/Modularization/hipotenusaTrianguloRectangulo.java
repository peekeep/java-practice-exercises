import java.util.Scanner;

public class hipotenusaTrianguloRectangulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double base1, altura1, base2, altura2, hipotenusa1, hipotenusa2;

        System.out.println("Ingrese la base de su primer triangulo en cm: ");
        base1 = sc.nextDouble();

        System.out.println("Ingrese la altura de su primer triangulo en cm: ");
        altura1 = sc.nextDouble();

        System.out.println("Ingrese la base de su segundo triangulo en cm: ");
        base2 = sc.nextDouble();

        System.out.println("Ingrese la altura de su segundo triangulo en cm: ");
        altura2 = sc.nextDouble();

        hipotenusa1 = calcularHipotenusa(base1, altura1);
        hipotenusa2 = calcularHipotenusa(base2, altura2);

        System.out.println("La hipotenusa del primer triangulo en metros es de: "+hipotenusa1+"\n"
        +"La hipotenusa del segundo triangulo en metros es de: "+hipotenusa2);

        sc.close();
    }
    
    public static double calcularHipotenusa(double base, double altura) {
        double hipotenusa;
        hipotenusa = Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2));
        return hipotenusa/100;
    }
}
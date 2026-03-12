import java.util.Scanner;

public class hipotenusaTriangulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double base, altura, hipotenusa1, hipotenusa2, hipotenusa3;

        System.out.println("Ingrese la base de su primer triangulo: ");
        base = sc.nextDouble();

        System.out.println("Ingrese la altura de su primer triangulo: ");
        altura = sc.nextDouble();

        hipotenusa1 = calcularHipotenusa(base, altura);

        System.out.println("Ingrese la base de su segundo triangulo: ");
        base = sc.nextDouble();

        System.out.println("Ingrese la altura de su segundo triangulo: ");
        altura = sc.nextDouble();

        hipotenusa2 = calcularHipotenusa(base, altura);

        System.out.println("Ingrese la base de su tercer triangulo: ");
        base = sc.nextDouble();

        System.out.println("Ingrese la altura de su tercer triangulo: ");
        altura = sc.nextDouble();

        hipotenusa3 = calcularHipotenusa(base, altura);

        System.out.println("La hipotenusa de su primer triangulo es de: "+hipotenusa1+"\n"
        +"La hipotenusa de su segundo triangulo es de: "+hipotenusa2+"\n"
        +"La hipotenusa de su tercer triangulo es de: "+hipotenusa3);

        sc.close();
    }

    public static double calcularHipotenusa(double base, double altura) {
        double hipotenusa;
        hipotenusa = Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2));
        return hipotenusa;
    }
}
import java.util.Scanner;

public class perimetroCirculo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double radio, perimetro1, perimetro2, perimetro3;

        System.out.println("Ingrese el radio de su primer circulo: ");
        radio = sc.nextDouble();

        perimetro1 = calcularPerimetro(radio);

        System.out.println("Ingrese el radio de su segundo circulo: ");
        radio = sc.nextDouble();

        perimetro2 = calcularPerimetro(radio);

        System.out.println("Ingrese el radio de su tercer circulo: ");
        radio = sc.nextDouble();

        perimetro3 = calcularPerimetro(radio);

        System.out.println("El perimetro de su primer circulo es de: "+perimetro1+"\n"
        +"El perimetro de su segundo circulo es de: "+perimetro2+"\n"
        +"El perimetro de su tercer circulo es de: "+perimetro3);

        sc.close();
    }

    public static double calcularPerimetro(double radio) {
        double perimetro;
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}
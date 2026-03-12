import java.util.Scanner;

public class calculoAreaTriangulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Ingrese la base de su triangulo: ");
        base = sc.nextDouble();

        System.out.println("Ingrese la altura de su triangulo: ");
        altura = sc.nextDouble();

        area = (base * altura)/2;

        System.out.println("El area de su triangulo es de: " +area);

        sc.close();
    }
}
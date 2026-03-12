import java.util.Scanner;

public class conversionTemperatura {
      public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int gradosCelsius, gradosFahrenheit;
        
        System.out.println("Ingrese su temperatura en grados Celsius: ");
        gradosCelsius = sc.nextInt();

        gradosFahrenheit = (gradosCelsius * 9/5) + 32;

        System.out.println("Su temperatura en grados Fahrenheit es de: "+gradosFahrenheit);

        sc.close();
      }
}
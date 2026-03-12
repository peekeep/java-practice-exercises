import java.util.Scanner;

public class numeroSuerte {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int diaNacimiento, mesNacimiento, añoNacimiento, numeroSuerte, ultimosDosDigitos, digito1, digito2;

        System.out.println("Ingrese su dia de nacimiento: ");
        diaNacimiento = sc.nextInt();

        System.out.println("Ingrese su mes de nacimiento: ");
        mesNacimiento = sc.nextInt();

        System.out.println("Ingrese su año de nacimiento: ");
        añoNacimiento = sc.nextInt();

        numeroSuerte = diaNacimiento + mesNacimiento + añoNacimiento;
        ultimosDosDigitos = numeroSuerte % 100;

        if (ultimosDosDigitos<20) {
            System.out.println("Su numero de la suerte es "+ultimosDosDigitos);
        }
        else {
             digito1 = ultimosDosDigitos / 10;
             digito2 = ultimosDosDigitos % 10;
             numeroSuerte = digito1 + digito2;
             System.out.println("Su numero de la suerte es "+numeroSuerte);
        }
        
        sc.close();
    }
}
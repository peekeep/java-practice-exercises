import java.util.Scanner;

public class misionEspacial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean tpsAlDia;
        int cantMascotas, cantFaltas;

        System.out.println("¿El alumno esta al dia con los TPs?: ");
        tpsAlDia = sc.nextBoolean();
        
        System.out.println("Ingrese su cantidad de mascotas: ");
        cantMascotas = sc.nextInt();

        System.out.println("Ingrese su cantidad de faltas: ");
        cantFaltas = sc.nextInt();

        if ((tpsAlDia) && (cantMascotas <=2) && (cantFaltas<=2)) {
            System.out.println("El alumno es candidato");
        }
        else {
            System.out.println("El alumno NO es candidato");
        }

        sc.close();
    }
}
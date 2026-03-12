import java.util.Scanner;

public class simulacro1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int i, j, cantPersonas, personasPiso, personasTotal;
        personasTotal = 0;
        personasPiso = 0;

        for (i=1;i<=12;i++) {
            for (j=1;j<=6;j++) {
                System.out.println("Ingrese la cantidad de personas en el depto: ");
                cantPersonas = sc.nextInt();

                personasPiso = personasPiso + cantPersonas;
            }
            System.out.println("La cantidad de personas en el piso es de: "+personasPiso);
            personasTotal = personasTotal + personasPiso;
            personasPiso = 0;
        }
        System.out.println("La cantidad de personas en el edificio es de: "+personasTotal);
    }
}
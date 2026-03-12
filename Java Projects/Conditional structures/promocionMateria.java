import java.util.Scanner;

public class promocionMateria {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nombre, apellido;
        double nota1, nota2, recuperatorio, promedioNotas;

        System.out.println("Ingrese el nombre de su alumno: ");
        nombre = sc.nextLine();

        System.out.println("Ingrese el apellido de su alumno: ");
        apellido = sc.nextLine();

        System.out.println("Ingrese la nota del primer parcial: ");
        nota1 = sc.nextDouble();

        System.out.println("Ingrese la nota del segundo parcial: ");
        nota2 = sc.nextDouble();

        promedioNotas = nota1 + nota2/2;

        if (promedioNotas >=80) {
            System.out.println("El alumno "+nombre+" "+apellido+" promociono la materia!");
        }
        else {
            System.out.println("Ingrese la nota del recuperatorio: ");
            recuperatorio = sc.nextDouble();

            if (recuperatorio >=90) {
                System.out.println("El alumno "+nombre+" "+apellido+" promociono la materia!");
            }
            else {
                System.out.println("El alumno "+nombre+" "+apellido+" NO promociono la materia!");
            }
        }

        sc.close();
    }
} 
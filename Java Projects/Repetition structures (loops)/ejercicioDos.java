import java.util.Scanner;

public class ejercicioDos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int i, j, alumnos, cantAlumnos, totalAlumnos;
        cantAlumnos=0;
        totalAlumnos=0;

        for (i=1;i<=10;i++) {
            for (j=1;j<=5;j++) {
                do {
                    System.out.println("¿Cuantos alumnos hay en este banco?");
                    alumnos = sc.nextInt();
                    if (alumnos != 1 && alumnos != 2) {
                        System.out.println("¡Error! Solo se permite 1 o 2.");
                    }
                    cantAlumnos=cantAlumnos+alumnos;
                }
                while (alumnos != 1 && alumnos != 2);
            }
            totalAlumnos=totalAlumnos+cantAlumnos;
            System.out.println("En esta aula hay "+cantAlumnos+" alumnos");
            cantAlumnos=0;
        }
        System.out.println("El total de alumnos en la escuela es de: "+totalAlumnos);
    }
}
import java.util.Scanner;

public class dibujoCanchas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        mostrarCancha1();
        mostrarCancha5();
        mostrarCancha2();
        mostrarCancha6();
        mostrarCancha2();
        mostrarCancha6();
        mostrarCancha2();
        mostrarCancha5();
        mostrarCancha1();
        
        sc.close();
    }

    public static void mostrarCancha1() {
    System.out.println("+---------------+");
    }

    public static void mostrarCancha2() {
    System.out.println("| +-----------+ |");
    }

    public static void mostrarCancha3() {
    System.out.println("| +-----|-----+ |");
    }

    public static void mostrarCancha4() {
    System.out.println("| +-----+-----+ |");
    }

    public static void mostrarCancha5() {
    System.out.println("|               |");
    }

    public static void mostrarCancha6() {
    System.out.println("| |     |     | |");
    }

    public static void mostrarCancha7() {
    System.out.println("| |           | |");
    }
}
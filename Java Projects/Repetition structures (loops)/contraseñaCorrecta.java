import java.util.Scanner;

public class contraseñaCorrecta {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String contraseña;

        System.out.println("Ingrese una contraseña: ");
        contraseña = sc.nextLine();

        while (!verificacionContraseña(contraseña)) {
            System.out.println("La contraseña NO es valida");
            System.out.println("Ingrese una contraseña: ");
            contraseña = sc.nextLine();
        }

        System.out.println("La contraseña es valida");
    }

    public static boolean verificacionContraseña(String contraseña) {
        return !contraseña.contains(" ")
        && verificacionLongitud(contraseña)
        && verificacionMinuscula(contraseña)
        && verificacionMayuscula(contraseña)
        && verificacionSimbolo(contraseña);
    }

    public static boolean verificacionLongitud(String contraseña) {
        return contraseña.length() >= 8 && contraseña.length() <= 12;
    }

    public static boolean verificacionMinuscula(String contraseña) {
        for (char c: contraseña.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verificacionMayuscula(String contraseña) {
        for (char c: contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }       
        return false; 
    }

    public static boolean verificacionSimbolo(String contraseña) {
        for (char c: contraseña.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }    
        }    
        return false;
    }
}
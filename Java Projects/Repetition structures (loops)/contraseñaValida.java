import java.util.Scanner;

public class contraseñaValida {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String contraseña;

            System.out.println("Escriba su contraseña: ");
            contraseña = sc.nextLine();

            if (verificacionContraseña(contraseña)) {
                System.out.println("La contraseña es valida");
            }
            else {
                System.out.println("La contraseña NO es valida");
            }
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
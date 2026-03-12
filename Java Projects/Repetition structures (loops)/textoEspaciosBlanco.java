import java.util.Scanner;

public class textoEspaciosBlanco {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String texto;
        int contador;

        System.out.println("Ingrese una oracion o texto: ");
        texto = sc.nextLine();

        contador = calcularPalabras(texto);

        System.out.println("La cantidad de palabras en su texto u oracion es de: "+contador);
    }

    public static int calcularPalabras(String texto) {
        if (texto.trim().isEmpty()) {
            return 0;
        }
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;    
    }
}
import java.util.Scanner;

public class textoCantidadPalabras {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String texto;
        int contador;

        System.out.println("Ingrese una oracion o texto: ");
        texto = sc.nextLine();

        contador = calcularPalabras(texto);

        System.out.println("La cantidad de palabras es de: "+contador);
    }

    public static int calcularPalabras(String texto) {
        texto = texto.trim();
        if (texto.isEmpty()) {
            return 0;
        }
        String[] palabras = texto.split(" ");
        return palabras.length;
    }
}
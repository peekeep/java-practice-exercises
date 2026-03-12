import java.util.Scanner;

public class textoLetrasVocales {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String texto;
        int contador;

        System.out.println("Ingrese una oracion o texto: ");
        texto = sc.nextLine();

        contador = calcularVocales(texto);

        System.out.println("La cantidad de letras vocales en el texto es de: "+contador);
    }

    public static int calcularVocales(String texto) {
        int i, contador;
        contador = 0;
        for (i=0; i<texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if (c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
}
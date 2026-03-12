import java.util.Scanner;

public class oracionCuantasPalabras {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String texto, respuesta;
        int contador;

        do {
            System.out.println("Ingrese una frase u oracion: ");
            texto = sc.nextLine();

            contador = calcularPalabras(texto);

            System.out.println("La cantidad de palabras de su texto es de: "+contador);

            System.out.println("¿Desea ingresar otra?");
            respuesta = sc.nextLine();
        }
        while (!respuesta.equals("no"));
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
import java.util.Scanner;

public class preparacionReceta {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Reunir 1 taza de arroz, 2 tazas de agua, sal y aceite (opcional).");
        System.out.println("2. Lavar el arroz (opcional).");
        System.out.println("3. Poner el arroz y el agua en una olla.");
        System.out.println("4. Agregar sal y aceite si se desea.");
        System.out.println("5. Llevar al fuego alto hasta que hierva.");
        System.out.println("6. Bajar el fuego, tapar y cocinar 15-20 minutos.");
        System.out.println("7. Apagar, dejar reposar 5 minutos y servir.");

        sc.close();
    }
}
import java.util.Scanner;

public class letraVocal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char letra;
        String vocalTex;

        System.out.println("Ingrese una letra: ");
        letra = sc.nextLine().charAt(0);

        switch (letra) {
            case 'a': vocalTex = "vocal"; break;
            case 'e': vocalTex = "vocal"; break;
            case 'i': vocalTex = "vocal"; break;
            case 'o': vocalTex = "vocal"; break;
            case 'u': vocalTex = "vocal"; break;
            default: vocalTex = "NO vocal"; break;
        }

        System.out.println("Su letra es: "+vocalTex);

        sc.close();
    }
}
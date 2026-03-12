import java.util.Scanner;

public class convCmAMt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double centimetros, metros1, metros2, metros3;

        System.out.println("Ingrese la primer cantidad de centimetros: ");
        centimetros = sc.nextDouble();

        metros1 = conversionCMaMT(centimetros);

        System.out.println("Ingrese la segunda cantidad de centimetros: ");
        centimetros = sc.nextDouble();

        metros2 = conversionCMaMT(centimetros);

        System.out.println("Ingrese la tercera cantidad de centimetros: ");
        centimetros = sc.nextDouble();

        metros3 = conversionCMaMT(centimetros);

        System.out.println("La primera conversion a metros es de: "+metros1+"\n"
        +"La segunda conversion a metros es de: "+metros2+"\n"
        +"La tercera conversion a metros es de: "+metros3);

        sc.close();
    }

    public static double conversionCMaMT(double centimetros) {
        double metros;
        metros = centimetros/100;
        return metros;
    }
}
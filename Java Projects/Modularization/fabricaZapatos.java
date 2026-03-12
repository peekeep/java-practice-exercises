import java.util.Scanner;

public class fabricaZapatos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double largo, ancho, altura, areaTotal, cantidadCarton, precioCarton, factura;
        int cantidadCajas;
        
        System.out.println("Ingrese el largo de su caja en cm: ");
        largo = sc.nextDouble();
        
        System.out.println("Ingrese el ancho de su caja en cm: ");
        ancho = sc.nextDouble();
        
        System.out.println("Ingrese el altura de su caja en cm: ");
        altura = sc.nextDouble();

        System.out.println("Ingrese la cantidad de cajas: ");
        cantidadCajas = sc.nextInt();
        
        System.out.println("Ingrese el precio de m2 del carton: ");
        precioCarton = sc.nextDouble();
        
        areaTotal = calculoCarton(largo, ancho, altura);
        cantidadCarton = areaTotal * cantidadCajas;
        factura = cantidadCarton * precioCarton; 

        System.out.println("La cantidad de carton que necesita en m2 es de: "+cantidadCarton);
        System.out.println("La cantidad a pagar en la factura es de: "+factura);
        
        sc.close();
    }

    public static double calculoCarton(double largo, double ancho, double altura) {
        double area, carton;
        area = 2 * (largo * ancho + largo * altura + ancho * altura);
        carton = area/10000.0;
        return carton;
    }
}
import java.util.Scanner;

public class libreriasOfertas {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double precio, precioFinal, Total, precioMasCaro;
        String tipo, respuesta;
        int contArtistico, contPapeleria, contUtiles;
        Total = 0;
        precioMasCaro = 0;
        contArtistico = 0; contPapeleria = 0; contUtiles = 0;

        do {
            System.out.println("Ingrese el precio del producto: ");
            precio = sc.nextDouble();
            sc.nextLine();

            System.out.println("Ingrese el tipo de producto: ");
            tipo = sc.nextLine();

            precioFinal = calcularPrecio(precio, tipo);
            System.out.println("El precio del producto (con descuento si tiene) es de: $"+precioFinal);

            System.out.println("¿Desea continuar?");
            respuesta = sc.nextLine();

            Total = Total + precioFinal;
            if (precioMasCaro<precioFinal) {
                precioMasCaro = precioFinal;
            }

            switch (tipo) {
                case "artistico": contArtistico++; break;
                case "papeleria": contPapeleria++; break;
                case "utiles": contUtiles++; break;
            }
        }
        while (!respuesta.equals("no"));

        System.out.println("El precio total a pagar es de: $"+Total);
        System.out.println("El precio del producto mas caro es de: $"+precioMasCaro);
        System.out.println("La cantidad de productos del tipo artistico es de: "+contArtistico);
        System.out.println("La cantidad de productos del tipo papeleria es de: "+contPapeleria);
        System.out.println("La cantidad de productos del tipo utiles es de: "+contUtiles);
    }

    public static double calcularPrecio(double precio, String tipo) {
        switch (tipo) {
            case "artistico": 
            return precio * 0.75; 
            case "papeleria":
            return precio * 0.90;
            default:
            return precio;
        }
    }
}
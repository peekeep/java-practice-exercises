import java.util.Scanner;

public class ejercicioUno {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String respuesta, respuestaUno;
        double precio, precioFinal;
        int cantLibros, totalLibros, mayorLibros;
        boolean estudiante;
        totalLibros=0;
        mayorLibros=0;

        do {
            System.out.println("Ingrese el precio del libro: ");
            precio = sc.nextDouble();

            System.out.println("Ingrese la cantidad de libros a comprar: ");
            cantLibros = sc.nextInt();
            totalLibros=totalLibros+cantLibros;

            System.out.println("¿El cliente es un estudiante?");
            respuesta = sc.next().toLowerCase();
            estudiante = respuesta.equals("si");

            precioFinal = calcularImporte(precio, cantLibros, estudiante);

            System.out.println("¿Desea terminar la compra?");
            respuestaUno = sc.next().toLowerCase();

            if (mayorLibros<cantLibros) {
                mayorLibros = cantLibros;
            }
        }
        while (!respuestaUno.equals("si"));

        System.out.println("El precio final es de: $"+precioFinal);
        System.out.println("El total de libros vendidos es de: "+totalLibros);
        System.out.println("La compra con mayor cantidad de libros es de: "+mayorLibros);
    }

    public static double calcularImporte(double precio, int cantLibros, boolean estudiante) {
        if (cantLibros>5 && estudiante==true) {
            return precio * cantLibros * 0.75;
        }
        return precio * cantLibros;
    }
}
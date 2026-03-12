import java.util.Scanner;

public class ejercicioOcho {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double precioCombo, precioFinal, totalIngreso;
        int cantCombos, cantidadCombos, mayorCombos;
        boolean miembro;
        String respuestaUno, respuestaDos;
        cantidadCombos=0;
        mayorCombos=0;
        totalIngreso=0;

        do {
            System.out.println("Ingrese el precio del combo: ");
            precioCombo=sc.nextDouble();

            System.out.println("Ingrese la cantidad de combos: ");
            cantCombos=sc.nextInt();
            cantidadCombos=cantidadCombos+cantCombos;

            System.out.println("¿Es miembro?");
            respuestaUno=sc.next().toLowerCase();
            miembro=respuestaUno.equals("si");

            precioFinal = calcularImporte(precioCombo, cantCombos, miembro);
            System.out.println("El precio final a pagar es de: $"+precioFinal);

            System.out.println("¿Desea terminar la compra?");
            respuestaDos=sc.next().toLowerCase();
            
            if (mayorCombos<cantCombos) {
                mayorCombos=cantCombos;
            }    
            totalIngreso=totalIngreso+precioFinal;

        }
        while (!respuestaDos.equals("si"));
        System.out.println("La cantidad de combos vendidos es de: "+cantidadCombos);
        System.out.println("La mayor cantidad de combos es de: "+mayorCombos);
        System.out.println("El ingreso total es de: "+totalIngreso);
    }

    public static double calcularImporte(double precioCombo, int cantCombos, boolean miembro) {
        if (cantCombos>3 || miembro==true) {
            return precioCombo * cantCombos * 0.82;
        }    
        return precioCombo * cantCombos;
    }
}
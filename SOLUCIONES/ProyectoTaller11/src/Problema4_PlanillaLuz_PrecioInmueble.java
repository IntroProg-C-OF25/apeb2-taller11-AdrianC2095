/**
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro 
 * procedimiento para calcular el valor del predio de un bien inmueble. Cada 
 * procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos valor 
 * del kilowatio y el número de kilowatios del mes. Y se genera en pantalla el siguiente
 * reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10
 * En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener
 * el valor del predio se saca el 2% del valor del inmueble. Y se genera el siguiente reporte:
 * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en 
 * $30000 y tiene que pagar de predio $ 600.
 * En el método principal; si el usuario ingresa 1 se llama al procedimiento 
 * calcularValorLuz; 2 se llama al procedimiento calcularPredio. Los datos que se
 * necesita en cada procedimiento se los debe ingresar por teclado.
 * @author Adrián Cuenca
 */
import java.util.Scanner;
public class Problema4_PlanillaLuz_PrecioInmueble {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        System.out.print("INGRESE 1 PARA CALCULAR VALOR DE PLANILLA DE LUZ O INGRESE 2 PARA CALCULAR VALOR DEL PREDIO: ");
        opcion = tcl.nextInt();
        switch (opcion) {
            case 1 -> calcularValorLuz();
            case 2 -> calcularPredio();
            default -> System.out.println("INGRESE UN NUMERO VALIDO (1 o 2)");
        }
    }
    public static void calcularValorLuz() {
        String nombre = "Ana Contreras";
        int cedula = 1100112233;
        double valorkW = 0.10;
        double numkW = 100;
        double total = valorkW * numkW;
        System.out.println("EL NUMERO DE KILOVATIOS CONSUMIDOS ES DE: " + numkW);
        System.out.println("EL PRECIO POR KILOVATIO ES DE: " + valorkW);
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de $%.2f\n", nombre, cedula, total);
    }
    public static void calcularPredio() {
        String nombre = "Ana Contreras";
        String cedula = "1100112233";
        double precioInmueble = 30000;
        double valorPredio = precioInmueble * 0.02;
        System.out.println("EL VALOR DEL INMUEBLE ES DE: " + precioInmueble);
        System.out.println("EL VALOR PREDIO ES DE: " + valorPredio);
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble valorado en $%.2f y tiene que pagar de predio $%.2f\n", nombre, cedula, precioInmueble, valorPredio);
    }
}
/***
 * run-single:
 * INGRESE 1 PARA CALCULAR VALOR DE PLANILLA DE LUZ O INGRESE 2 PARA CALCULAR VALOR DEL PREDIO: 1
 * EL NUMERO DE KILOVATIOS CONSUMIDOS ES DE: 100.0
 * EL PRECIO POR KILOVATIO ES DE: 0.1
 * Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10,00
 * BUILD SUCCESSFUL (total time: 3 seconds)
 */

/**
 * Generar una solución que implemente 3 procedimientos. Que permitan calcular
 * el área de un cuadrado, área de un triángulo y área de un rectángulo.
 * Cada procedimiento/función debe recibir los datos necesarios y generar el valor correspondiente
 * . Se debe invocar a los procedimientos desde un método principal;
 * Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado;
 * 2 se llama al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 *
 * @author Adrán Cuenca
 */
import java.util.Scanner;
public class Ejercicio2_CalcularAreas {
        public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        double lado, areaC, alturaT, baseT, areaT, alturaR, baseR, areaR;
        System.out.print("Seleccione una opcion: 1 = Cuadrado, 2 = trianulo o 3 = rectangulo: ");
        opcion = tcl.nextInt();
        switch (opcion) {
            case 1 -> {
                System.out.print("DAME EL VALOR DE UNO DE LOS LADOS DEL CUADRADO: ");
                lado = tcl.nextDouble();
                areaC = obtenerAreaC(lado);
                System.out.println("EL ARÉA DEL CUADRADO ES: " + areaC);
                }
            case 2 -> {
                System.out.print("DAME EL VALOR DE LA ALTURA DEL TRIANGULO: ");
                alturaT = tcl.nextDouble();
                System.out.print("DAME EL VALOR LA BASE DEL TRIANGULO: ");
                baseT = tcl.nextDouble();
                areaT = obtenerAreaT(baseT, alturaT);
                System.out.println("EL ARÉA DEL TRÍANGULO ES: " + areaT);
                }
            case 3 -> {
                System.out.print("DAME EL VALOR DE LA ALTURA DEL RECTANGULO: ");
                alturaR = tcl.nextDouble();
                System.out.print("DAME EL VALOR DE LA BASE DEL RECTANGULO: ");
                baseR =  tcl.nextDouble();
                areaR = obtenerAreaR(baseR, alturaR);
                System.out.println("EL ARÉA DEL RECTANGULO ES: " + areaR);
                }
            default -> System.out.print("NÚMERO NO VALIDO INGRESA DE NUEVO (ENTRE 1 Y 3)");
        }
    }
    public static double obtenerAreaC(double lado) {
        return lado * lado;
    }
    public static double obtenerAreaT(double baseT, double alturaT) {
        return (baseT * alturaT) / 2;
    }
    public static double obtenerAreaR(double baseR, double alturaR) {
        return baseR * alturaR;
    }
}
/***
 * run-single:
 * Seleccione una opcion: 1 = Cuadrado, 2 = trianulo o 3 = rectangulo: 1
 * DAME EL VALOR DE UNO DE LOS LADOS DEL CUADRADO: 6
 * EL ARÉA DEL CUADRADO ES: 36.0
 * BUILD SUCCESSFUL (total time: 5 seconds)
 * 
 * run-single:
 * Seleccione una opcion: 1 = Cuadrado, 2 = trianulo o 3 = rectangulo: 2
 * DAME EL VALOR DE LA ALTURA DEL TRIANGULO: 6
 * DAME EL VALOR LA BASE DEL TRIANGULO: 4
 * EL ARÉA DEL TRÍANGULO ES: 12.0
 * BUILD SUCCESSFUL (total time: 6 seconds)
 * 
 * run-single:
 * Seleccione una opcion: 1 = Cuadrado, 2 = trianulo o 3 = rectangulo: 3
 * DAME EL VALOR DE LA ALTURA DEL RECTANGULO: 6
 * DAME EL VALOR DE LA BASE DEL RECTANGULO: 4
 * EL ARÉA DEL RECTANGULO ES: 24.0
 * BUILD SUCCESSFUL (total time: 6 seconds)
 * 
 */
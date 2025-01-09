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

 * @author Adrán Cuenca
 */
import java.util.Scanner;
public class Ejercicio2_CalcularAreas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        System.out.print("Seleccione una opcion: 1 = Cuadrado, 2 = trianulo, 3 = rectangulo: ");
        opcion = tcl.nextInt();
        Switch case (opcion){
            case 1:
            double lado, areaC;
            System.out.print("Dame la medida de un lado del cuarado: ");
            laod tcl =
    }
}
    public static double generarAreaCuadrado(double lado){
        return lado * lado;
    }
    
}
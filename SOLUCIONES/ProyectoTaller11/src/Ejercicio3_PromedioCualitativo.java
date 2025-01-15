/**
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio
 * cualitativo de los parámetros. Si el promedio es: De 0 a 5 el promedio cualitativo
 * es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno De 9.1
 * a 10 el promedio es Sobresaliente. A la función se la debe llamar desde un método principal.
 * Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 *
 * @author Adrián Cuenca
 */
public class Ejercicio3_PromedioCualitativo {
    public static void main(String[] args) {
        double n1, n2, n3 ,n4, promedio;
        n1 = Math.random() * 10;
        n2 = Math.random() * 10;
        n3 = Math.random() * 10;
        n4 = Math.random() * 10;
        System.out.println("LAS NOTAS DECIMALES SON:");
        System.out.printf("NOTA 1: %.2f\n" , n1);
        System.out.printf("NOTA 2: %.2f\n" , n2);
        System.out.printf("NOTA 3: %.2f\n" , n3);
        System.out.printf("NOTA 4: %.2f\n" , n4);
        promedio = (n1 + n2 + n3 + n4) /4;
        System.out.printf("EL PROMEDIO DE LAS NOTAS ES: %.2f\n", promedio);
        String resultado = obtenerPromedioC(n1, n2, n3, n4);
        System.out.println("EL PROMEDIO ES: " + resultado);
        System.out.println("EL PROMEDIO CUALITATIVO ES: " + resultado);
    }
    public static String obtenerPromedioC(double num1, double num2, double num3, double num4){
        double promedio = (num1 + num2 + num3 + num4) / 4;
        if (promedio >= 0 && promedio <= 5) {
            return "REGULAR";
        } else if (promedio > 5 && promedio <= 8) {
            return "BUENO";
        } else if (promedio > 8 && promedio <= 9 ) {
            return "MUY BUENO";
        } else if (promedio > 9){
            return "SOBRESALIENTE";
        }
        return null;
    }
}
/***
 * run-single:
 * LAS NOTAS DECIMALES SON:
 * NOTA 1: 2,66
 * NOTA 2: 0,59
 * NOTA 3: 8,31
 * NOTA 4: 7,51
 * EL PROMEDIO DE LAS NOTAS ES: 4,77
 * EL PROMEDIO ES: REGULAR
 * EL PROMEDIO CUALITATIVO ES: REGULAR
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */


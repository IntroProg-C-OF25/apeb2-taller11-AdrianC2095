/**
 * Generar las funciones/métodos que devuelvan las suma, resta y multiplicación
 * de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 * @author Adrián Cuenca
 */
import java.util.Scanner;
public class Ejercicio5_OperacionesMatriz {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limFil = 0, limCol = 0;
        System.out.print("DIME EL TAMAÑO DE LA MATRIZ: ");
        limFil = tcl.nextInt();
        limCol = limFil;
        int matriz[][] = new int[limFil][limCol];
        generarMatriz(matriz);
        System.out.println("MATRIZ GENERADA");
        presentarMatriz(matriz);
        int suma = sumaMatriz(matriz);
        System.out.println("LA SUMA DE LA MATRIZ ES: " + suma);
        int resta = restaMatriz(matriz);
        System.out.println("LA RESTA DE LA MATRIZ ES: " + resta);
        long mult = multiplicacionMatriz(matriz);
        System.out.println("LA MULTIPLICACION DE LA MATRIZ ES: " + mult);
    }
    public static void generarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
    }
    public static void presentarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int sumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
    public static int restaMatriz(int[][] matriz) {
        int resta = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (! (i == 0 && j == 0)){
                    resta -= matriz[i][j];
                }
            }
        }
        return resta;
    }
    public static long multiplicacionMatriz(int[][] matriz) {
        long mult = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                mult *= matriz[i][j];
            }
        }
        return mult;
    }
}
/***
 * run-single:
 * DIME EL TAMAÑO DE LA MATRIZ: 4
 * MATRIZ GENERADA
 * 1 4 6 9 
 * 9 9 4 3 
 * 7 7 1 6 
 * 4 8 8 1 
 * LA SUMA DE LA MATRIZ ES: 87
 * LA RESTA DE LA MATRIZ ES: -85
 * LA MULTIPLICACION DE LA MATRIZ ES: 15801827328
 * BUILD SUCCESSFUL (total time: 3 seconds)
 */

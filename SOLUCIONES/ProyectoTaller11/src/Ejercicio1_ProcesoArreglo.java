/**
 * Generar los procedimientos y/o funciones que impriman los valor pares, impares
 * y el promedio de un arreglo bidimensional. El (los) procedimiento(s) o método(s)
 * deben ser invocados desde el método principal (quien es el único responsable
 * de gestionar las entradas/salidas); además el método debe recibir como parámetro un arreglo bidimensional.
 *
 * @author Adrián Cuenca
 */
import java.util.Scanner;
public class Ejercicio1_ProcesoArreglo {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limFil = 0, limCol = 0;
        System.out.print("DAME EL LIMITE FILAS Y LIMITE DE COLUMNAS: ");
        limFil = tcl.nextInt();
        limCol = tcl.nextInt();
        int matriz[][] = new int[limFil][limCol];
        generarMatriz(matriz);
        System.out.println("MATRIZ GENERADA");
        presentarMatriz(matriz);
        presentarParImparMatriz(matriz);
        presentarPromedioMatriz(matriz);
    }
    public static void generarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static void presentarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void presentarParImparMatriz(int matriz[][]) {
        System.out.println("ELEMENTOS PARA DE LA MATRIZ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 == 0) ? matriz[i][j] : "");
                /*if ( (matriz[i][j]%2) == 0)
                    System.out.println(matriz[i][j]+" " );*/
            }
            System.out.println("");
        }
        System.out.println("ELEMENTOS IMPARES DE LA MATRIZ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 != 0) ? matriz[i][j] : "");
            }
            System.out.println("");
        }
    }
    public static void presentarPromedioMatriz(int matriz[][]) {
        int sumaMatriz = 0, promedioMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaMatriz += matriz[i][j];
            }
        }
        promedioMatriz = sumaMatriz / (matriz.length * matriz[0].length);
        System.out.println("PROMEDIO DE LA MATRIZ: " + promedioMatriz);
    }
}
/***
 * run-single:
 * DAME EL LIMITE FILAS Y LIMITE DE COLUMNAS: 4 3
 * MATRIZ GENERADA
 * 3 6 4 
 * 9 9 6 
 * 3 9 8 
 * 3 6 7 
 * ELEMENTOS PARA DE LA MATRIZ
 * 64
 * 6
 * 8
 * 6
 * ELEMENTOS IMPARES DE LA MATRIZ
 * 3
 * 99
 * 39
 * 37
 * PROMEDIO DE LA MATRIZ: 6
 * BUILD SUCCESSFUL (total time: 5 seconds)
 */

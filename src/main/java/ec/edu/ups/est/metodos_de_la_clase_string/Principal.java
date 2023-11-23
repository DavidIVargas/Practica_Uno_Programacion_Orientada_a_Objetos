/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.est.metodos_de_la_clase_string;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author davidvargas
 */
public class Principal {

    public static void main(String[] args) {
        //TiempoYOrdenamiento obj = new TiempoYOrdenamiento();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de datos para el vector:");
        int cantidadDatos = scanner.nextInt();

        Random rand = new Random();
        int[] vector = new int[cantidadDatos];
        for (int i = 0; i < cantidadDatos; i++) {
            vector[i] = rand.nextInt(10000);
        }

        System.out.println("Datos en desorden: " + Arrays.toString(vector));

        int[] copiaVector = Arrays.copyOf(vector, vector.length);

        TiempoYOrdenamiento.medirTiempo(copiaVector, "Burbuja");
        System.out.println("Ordenado con Burbuja: " + Arrays.toString(copiaVector));

        copiaVector = Arrays.copyOf(vector, vector.length);

        TiempoYOrdenamiento.medirTiempo(copiaVector, "Insercion");
        System.out.println("Ordenado con Insercion: " + Arrays.toString(copiaVector));

        copiaVector = Arrays.copyOf(vector, vector.length);

        TiempoYOrdenamiento.medirTiempo(copiaVector, "Seleccion");
        System.out.println("Ordenado con Seleccion: " + Arrays.toString(copiaVector));

        copiaVector = Arrays.copyOf(vector, vector.length);

        TiempoYOrdenamiento.medirTiempo(copiaVector, "MergeSort");
        System.out.println("Ordenado con MergeSort: " + Arrays.toString(copiaVector));

        copiaVector = Arrays.copyOf(vector, vector.length);

        TiempoYOrdenamiento.medirTiempo(copiaVector, "QuickSort");
        System.out.println("Ordenado con QuickSort: " + Arrays.toString(copiaVector));
/*
        copiaVector = Arrays.copyOf(vector, vector.length);
        TiempoYOrdenamiento.medirTiempo(copiaVector, "HeapSort");
        System.out.println("Ordenado con HeapSort: " + Arrays.toString(copiaVector));
*/
    }

}

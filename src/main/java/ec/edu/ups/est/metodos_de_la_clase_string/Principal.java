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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de datos para el vector:");
        int cantidadDatos = scanner.nextInt();

        Random rand = new Random();
        int[] vector = new int[cantidadDatos];
        for (int i = 0; i < cantidadDatos; i++) {
            vector[i] = rand.nextInt(1000); // Números aleatorios hasta 1000 para ejemplo
        }

        int[] copiaVector = Arrays.copyOf(vector, vector.length);

        TiempoYOrdenamiento.medirTiempo(copiaVector, "Burbuja");
        copiaVector = Arrays.copyOf(vector, vector.length);

        TiempoYOrdenamiento.medirTiempo(copiaVector, "Insercion");
        copiaVector = Arrays.copyOf(vector, vector.length);

        TiempoYOrdenamiento.medirTiempo(copiaVector, "Seleccion");
        copiaVector = Arrays.copyOf(vector, vector.length);

        TiempoYOrdenamiento.medirTiempo(copiaVector, "MergeSort");
        copiaVector = Arrays.copyOf(vector, vector.length);

        TiempoYOrdenamiento.medirTiempo(copiaVector, "QuickSort");
    }
}

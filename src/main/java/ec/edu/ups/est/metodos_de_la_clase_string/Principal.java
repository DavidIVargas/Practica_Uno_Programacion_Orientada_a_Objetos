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
        // Crea un objeto Scanner para obtener entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario la cantidad de datos para el vector
        System.out.println("Ingrese la cantidad de datos para el vector:");
        int cantidadDatos = scanner.nextInt();

        // Crea un objeto Random para generar números aleatorios
        Random rand = new Random();

        // Crea un arreglo de enteros con la cantidad especificada por el usuario
        int[] vector = new int[cantidadDatos];

        // Llena el vector con números aleatorios entre 0 y 9999
        for (int i = 0; i < cantidadDatos; i++) {
            vector[i] = rand.nextInt(10000);
        }

        // Muestra el vector desordenado en la consola
        System.out.println("Datos en desorden: " + Arrays.toString(vector));

        // Crea una copia del vector para cada algoritmo de ordenamiento
        int[] copiaVector = Arrays.copyOf(vector, vector.length);

        // Ordena y muestra el vector utilizando el algoritmo de ordenamiento Burbuja
        AlgoritmosOrdenamiento.burbuja(copiaVector);
        System.out.println("Ordenado con Burbuja: " + Arrays.toString(copiaVector));

        // Crea una nueva copia del vector para el siguiente algoritmo de ordenamiento
        copiaVector = Arrays.copyOf(vector, vector.length);

        // Ordena y muestra el vector utilizando el algoritmo de ordenamiento por Inserción
        AlgoritmosOrdenamiento.insercion(copiaVector);
        System.out.println("Ordenado con Insercion: " + Arrays.toString(copiaVector));

        // Crea una nueva copia del vector para el siguiente algoritmo de ordenamiento
        copiaVector = Arrays.copyOf(vector, vector.length);

        // Ordena y muestra el vector utilizando el algoritmo de ordenamiento por Selección
        AlgoritmosOrdenamiento.seleccion(copiaVector);
        System.out.println("Ordenado con Seleccion: " + Arrays.toString(copiaVector));

        // Crea una nueva copia del vector para el siguiente algoritmo de ordenamiento
        copiaVector = Arrays.copyOf(vector, vector.length);

        // Ordena y muestra el vector utilizando el algoritmo de ordenamiento Merge Sort
        AlgoritmosOrdenamiento.mergeSort(copiaVector, 0, copiaVector.length - 1);
        System.out.println("Ordenado con MergeSort: " + Arrays.toString(copiaVector));

        // Crea una nueva copia del vector para el siguiente algoritmo de ordenamiento
        copiaVector = Arrays.copyOf(vector, vector.length);

        // Ordena y muestra el vector utilizando el algoritmo de ordenamiento Quick Sort
        AlgoritmosOrdenamiento.quickSort(copiaVector);
        System.out.println("Ordenado con QuickSort: " + Arrays.toString(copiaVector));
    }
}

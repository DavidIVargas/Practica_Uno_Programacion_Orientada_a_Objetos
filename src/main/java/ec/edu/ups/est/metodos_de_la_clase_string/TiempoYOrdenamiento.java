/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.metodos_de_la_clase_string;

/**
 *
 * @author davidvargas
 */
public class TiempoYOrdenamiento {

    public static void medirTiempo(int[] arr, String nombreAlgoritmo) {
        long startTime = System.nanoTime();
        switch (nombreAlgoritmo) {
            case "Burbuja":
                AlgoritmosOrdenamiento.burbuja(arr);
                break;
            case "Insercion":
                AlgoritmosOrdenamiento.insercion(arr);
                break;
            case "Seleccion":
                AlgoritmosOrdenamiento.seleccion(arr);
                break;
            case "MergeSort":
                AlgoritmosOrdenamiento.mergeSort(arr, 0, arr.length - 1);
                break;
            case "QuickSort":
                AlgoritmosOrdenamiento.quickSort(arr, 0, arr.length - 1);
                break;
                /*
            case "HeapSort":
                AlgoritmosOrdenamiento.heapSort(arr);
                break;
*/
            default:
                System.out.println("Algoritmo no reconocido");
                return;
        }
        long endTime = System.nanoTime();
        long tiempoEjecucion = endTime - startTime;
        System.out.println("Tiempo de ejecución de " + nombreAlgoritmo + ": " + tiempoEjecucion + " nanosegundos");
    }
}

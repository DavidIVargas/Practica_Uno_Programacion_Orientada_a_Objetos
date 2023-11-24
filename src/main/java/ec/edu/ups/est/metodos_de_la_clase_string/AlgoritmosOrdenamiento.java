/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.metodos_de_la_clase_string;

/**
 *
 * @author davidvargas
 */
public class AlgoritmosOrdenamiento {
    /*
    funciona revisando cada elemento de la lista a ordenar con el que le sigue, 
    cambiándolos de posición si están en un orden incorrecto. 
    repetimos este proceso varias veces hasta que no se necesiten más cambios
    */
    public static void burbuja(int[] arr) {
        long startTime = System.nanoTime();
        // Algoritmo de ordenamiento burbuja
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Tiempo de ejecución de burbuja: " + duration + " nanosegundos");
    }
    /*
    El método de ordenamiento de inserción actua recorriendo la lista a ordenar, 
    tomando el elemento actual e insertándolo donde debería, comparandoló entre los que ya ha recorrido.
    */
    public static void insercion(int[] arr) {
        long startTime = System.nanoTime();
        // Algoritmo de ordenamiento por inserción
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Tiempo de ejecución de inserción: " + duration + " nanosegundos");
    }
    /*
    El Método de ordenamiento por selección consiste en buscar el menor entre todos los elementos no ordenados y colocarlo al principio, 
    se debe repetir lo mismo con los restantes (no se tienen en cuenta los ya ordenados).
    */
    public static void seleccion(int[] arr) {
        long startTime = System.nanoTime();
        // Algoritmo de ordenamiento por selección
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Tiempo de ejecución de selección: " + duration + " nanosegundos");
    }
    /*
    Divide el arreglo en mitades hasta que queden subarreglos de tamaño 1.
    Luego combina (mezcla) los subarreglos ordenadamente, fusionando gradualmente en orden ascendente.
    */
    /**
 * Ordena un arreglo de enteros utilizando el algoritmo de ordenamiento Merge Sort.
 * @param arr Arreglo de enteros a ordenar.
 * @param l Índice izquierdo del arreglo.
 * @param r Índice derecho del arreglo.
 */
    public static void mergeSort(int[] arr, int l, int r) {
        long startTime = System.nanoTime();
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Tiempo de ejecución de mergeSort: " + duration + " nanosegundos");
    }
/**
 * Realiza la mezcla ordenada de dos sub-arreglos para el Merge Sort.
 * @param arr Arreglo de enteros a ordenar.
 * @param l Índice izquierdo del sub-arreglo.
 * @param m Índice medio del sub-arreglo.
 * @param r Índice derecho del sub-arreglo.
 */
    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    /*
    Elige un elemento llamado pivote y coloca todos los elementos menores a su izquierda y los mayores a su derecha.
    Luego repite el proceso de forma recursiva para los subarreglos izquierdo y derecho del pivote.
    
    * Ordena un arreglo de enteros utilizando el algoritmo de ordenamiento Quick Sort.
    * @param arr Arreglo de enteros a ordenar.
    */
    public static void quickSort(int[] arr) {
        long startTime = System.nanoTime();
        quickSortHelper(arr, 0, arr.length - 1);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Tiempo de ejecución de quickSort: " + duration + " nanosegundos");
    }
    /**
    * Helper privado que implementa la lógica del Quick Sort de forma recursiva.
    * @param arr Arreglo de enteros a ordenar.
    * @param low Índice más bajo del arreglo.
    * @param high Índice más alto del arreglo.
    */
    private static void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSortHelper(arr, low, pi - 1);
            quickSortHelper(arr, pi + 1, high);
        }
    }
    /**
    * Partición utilizada en el algoritmo de Quick Sort para dividir el arreglo.
    * @param arr Arreglo de enteros a ordenar.
    * @param low Índice más bajo del arreglo.
    * @param high Índice más alto del arreglo.
    * @return Índice del pivote.
    */
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    //private es para el encapsulamiento y el control de acceso
    /*
    los métodos private están destinados a ser utilizados únicamente dentro de la clase AlgoritmosOrdenamiento y no desde otras clases.
    */
}

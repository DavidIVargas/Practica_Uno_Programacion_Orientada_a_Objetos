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
    Recorre el arreglo múltiples veces.
    Compara cada elemento con el siguiente e intercambia si están en el orden incorrecto, 
    llevando los elementos más grandes hacia el final del arreglo en cada pasada.
    */
    public static void burbuja(int[] arr) {
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
    }
    /*
    Itera sobre el arreglo.
    Para cada elemento, lo compara con los elementos a su izquierda en el arreglo ordenado, 
    insertándolo en la posición correcta y desplazando los elementos mayores una posición hacia la derecha.
    */
    public static void insercion(int[] arr) {
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
    }
    /*
    Busca el elemento más pequeño en el arreglo y lo intercambia con el primer elemento.
    Luego busca el segundo elemento más pequeño y lo intercambia con el segundo lugar, y así sucesivamente.
    */
    public static void seleccion(int[] arr) {
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
    }
    /*
    Divide el arreglo en mitades hasta que queden subarreglos de tamaño 1.
    Luego combina (mezcla) los subarreglos ordenadamente, fusionando gradualmente en orden ascendente.
    */
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

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
    */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
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
    
    public static void heapSort(int[] arr) {
    int n = arr.length;

    // Construir un heap (reorganizar el arreglo)
    for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
    }

    // Extraer elementos del heap uno por uno
    for (int i = n - 1; i > 0; i--) {
        // Mover la raíz actual al final
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;

        // Llamar a heapify en el heap reducido
        heapify(arr, i, 0);
    }
}

public static void heapify(int[] arr, int n, int i) {
    int largest = i; // Inicializar el nodo más grande como raíz
    int leftChildIdx = 2 * i + 1; // índice del hijo izquierdo
    int rightChildIdx = 2 * i + 2; // índice del hijo derecho

    // Si el hijo izquierdo es más grande que la raíz
    if (leftChildIdx < n && arr[leftChildIdx] > arr[largest]) {
        largest = leftChildIdx;
    }

    // Si el hijo derecho es más grande que el nodo más grande hasta ahora
    if (rightChildIdx < n && arr[rightChildIdx] > arr[largest]) {
        largest = rightChildIdx;
    }

    // Si el nodo más grande no es la raíz
    if (largest != i) {
        int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;

        // Recursivamente heapify el subárbol afectado
        heapify(arr, n, largest);
    }
}
}

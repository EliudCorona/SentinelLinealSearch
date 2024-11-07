import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SentinelLinearSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Define el arreglo y el valor a buscar
        int[] array = {3, 5, 7, 9, 11, 13, 17}; // Ejemplo

        System.out.print("Ingresa el número que deseas buscar: ");
        
        // Lee el valor a buscar usando BufferedReader
        int target = Integer.parseInt(reader.readLine());

        // Ejecutar la búsqueda lineal con centinela
        int position = sentinelLinearSearch(array, target);

        // Mostrar el resultado
        if (position != -1) {
            System.out.println("Elemento encontrado en la posición: " + position);
        } else {
            System.out.println("Elemento no encontrado en el arreglo.");
        }
    }

    public static int sentinelLinearSearch(int[] array, int target) {
        int length = array.length;
        
        // Agregar el centinela
        int lastElement = array[length - 1];
        array[length - 1] = target;

        // Realizar la búsqueda
        int i = 0;
        while (array[i] != target) {
            i++;
        }

        // Restaurar el último elemento
        array[length - 1] = lastElement;

        // Comprobar si el elemento fue encontrado
        if (i < length - 1 || array[length - 1] == target) {
            return i;
        } else {
            return -1;
        }
    }
}


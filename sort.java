import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class sort {

    public static void main(String[] args) {

        int[] new_array = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < new_array.length; i++) {
            new_array[i] = rnd.nextInt(0, 50);
        }
        for (int i = 0; i < new_array.length; i++) {
            System.out.print(new_array[i] + " ");

        }

        heapSort(new_array);
        System.out.println(" ");
        for (int i = 0; i < new_array.length; i++) {
            System.out.print(new_array[i] + " ");
        }

    }

    public static void heapBuilder(int[] array, int len, int root) {

        int max = root;
        int child_1 = 2 * root + 1;
        int child_2 = 2 * root + 2;

        if (child_1 < len && array[child_1] > array[max]) {
            max = child_1;
        }

        if (child_2 < len && array[child_2] > array[max]) {
            max = child_2;
        }

        if (max != root) {
            int buf = array[max];
            array[max] = array[root];
            array[root] = buf;
            heapBuilder(array, len, max);
        }

    }

    public static void heapSort(int[] array) {

        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapBuilder(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0; i--) {

            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapBuilder(array, i, 0);

        }

    }

}
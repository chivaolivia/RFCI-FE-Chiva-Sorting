import java.util.Arrays;

public class SortingChiva {
    public static void insertionSort(int array[]) {
        int n = array.length;
        int count = 0;
        for (int j = 1; j < n; j++) {
            int current = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > current ) ) {
                array [i+1] = array [i];
                System.out.println((count+1) + ". [" + current + "," + array [i] +"]" + " -> " + Arrays.toString(array));
                i--;
                count++;
            }
            array[i+1] = current;
        }
        System.out.println("Jumlah swap = " + count);
    }

    public static void main(String a[]){
        int[] arr1 = {2,5,4,1,8,9,5};

        insertionSort(arr1);//sorting array using insertion sort

        System.out.println("Hasil = " + Arrays.toString(arr1));



    }
}
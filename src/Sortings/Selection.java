package Sortings;

import java.util.Scanner;

class Selection {
    private void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int minPos = i;
            for(int j = i; j < array.length; j++) {
                if(array[j] <= min) {
                    min = array[j];
                    minPos = j;
                }
            }

            int swap = array[i];
            array[i] = array[minPos];
            array[minPos] = swap;
        }
    }

    public static void main(String[] args) {
        Selection bubble = new Selection();
        Library library = new Library();

        int[] array = library.scan();
        bubble.sort(array);
        library.print(array);
    }
}

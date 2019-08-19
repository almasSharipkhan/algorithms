package Sortings;

import java.util.Scanner;

class Bubble {
    private void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < (array.length - 1) - i; j++) {
                if(array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        Bubble bubble = new Bubble();
        Library library = new Library();

        int[] array = library.scan();
        bubble.sort(array);
        library.print(array);
    }
}

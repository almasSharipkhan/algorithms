package Sortings;

import java.util.Scanner;

public class Library {
    int[] scan() {
        Scanner consoleScanner = new Scanner(System.in);

        int length = consoleScanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = consoleScanner.nextInt();
        }

        return array;
    }
    void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

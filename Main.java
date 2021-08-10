package com.sksoft;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] unsorted = {5, 7, 4, 3, 8, 9, 6, 2};

        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i]+ " ");
        }
        System.out.println();

        for (int i = unsorted.length; i > 1; i--) {
            for (int j = 0; j < unsorted.length - 1; j++) {
                if (unsorted[j] > unsorted[j + 1]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i]+ " ");
        }

    }
}

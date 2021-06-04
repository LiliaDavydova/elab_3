package com.epam.test.automation.java.practice3;

public class Main {

    private Main() {

    }

    public static int[] task1(int[] array) {

        int j = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] % 2 == 0 && array[j] % 2 == 0) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
            j--;
        }
        return array;
    }

    public static int task2(int[] array) {

        int max = array[0];
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                firstIndex = i;
                lastIndex = i;
            } else if (array[i] == max) {
                lastIndex = i;
            }
        }
        return lastIndex - firstIndex;
    }

    public static int[][] task3(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j < i) {
                    matrix[i][j] = 0;
                } else if (j > i) {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }
}

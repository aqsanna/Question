package com.company;

public class Minimum {
    public void min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public int minSecondElement(int[] arr2) {
        int temp;
        for (int i = 0; i < arr2.length; i++)
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] > arr2[j]) {
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }

            }
        return arr2[1];
    }

    public int maxCount(int[] arr3) {
        int count = 0;
        int max = arr3[0];
        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] > max) {
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        Minimum minimum = new Minimum();
        int[] array = {4, 2, 14, -1};
        int[] array2 = {6, 7, 2, -5, -10, 15, 11};
        int[] array3 ={6, 7, 2, -5, -10, 15, 11,15,50,7};
        minimum.min(array);
        System.out.println(minimum.minSecondElement(array2));
        System.out.println(minimum.maxCount(array3));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author basisb29
 */
public class Sort {

    public static void main(String[] args) {
        int data[] = {4, 56, 87, 12, 36};
        int data1[] = {4, 56, 87, 12, 36};
        int data2[] = {4, 56, 87, 12, 36};
        System.out.println("Data Sebelum Diurutkan");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("Bubble Sort");
        BubbleSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println("");
        System.out.println("Selection Sort");
        SelectionSort(data1);
        for (int i = 0; i < data1.length; i++) {
            System.out.print(data1[i] + " ");
        }

        System.out.println("");
        System.out.println("Insertion Sort");
        InsertionSort(data);
        for (int i = 0; i < data2.length; i++) {
            System.out.print(data2[i] + " ");
        }

    }

    public static int[] BubbleSort(int a[]) {
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j + 1] < a[j]) {
                    int swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;
                }
            }
        }
        return a;
    }

    public static int[] SelectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (array[min] != i) {
                int swap = array[min];
                array[min] = array[i];
                array[i] = swap;
            }
        }
        return array;
    }

    public static int[] InsertionSort(int[] list) {
        int holePosition;
        int valueToInsert;
        for (int i = 1; i < list.length; i++) {
            valueToInsert = list[i];
            holePosition = i;
            while (holePosition > 0 && list[holePosition - 1] > valueToInsert) {
                list[holePosition] = list[holePosition - 1];
                holePosition = holePosition - 1;
            }
            list[holePosition] = valueToInsert;
        }
        return list;
    }
}

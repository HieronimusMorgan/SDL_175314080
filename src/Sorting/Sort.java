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
        System.out.println("Data Sebelum Diurutkan");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("Selection Sort");
        InsertionSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        SelectionSort(data);
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

    public static int[] SelectionSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int NilaiKecil = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[NilaiKecil]) {
                    NilaiKecil = j;
                }
            }
            if (a[NilaiKecil] != i) {
                int swap = a[NilaiKecil];
                a[NilaiKecil] = a[i];
                a[i] = swap;
            }
        }
        return a;
    }

    public static int[] InsertionSort(int[] a) {
        int holePosition;
        int valueToInsert;
        for (int i = 1; i < a.length; i++) {
            valueToInsert = a[i];
            holePosition = i;
            while (holePosition > 0 && a[holePosition - 1] > valueToInsert) {
                a[holePosition] = a[holePosition - 1];
                holePosition = holePosition - 1;
            }
            a[holePosition] = valueToInsert;
        }
        return a;
    }
}

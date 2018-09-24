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
        int dataBubble1[] = {4, 56, 87, 12, 36};
        int dataBubble2[] = {4, 56, 87, 12, 36};
        int dataSelection1[] = {4, 56, 87, 12, 36};
        int dataSelection2[] = {4, 56, 87, 12, 36};
        int dataInsertion1[] = {4, 56, 87, 12, 36};
        int dataInsertion2[] = {4, 56, 87, 12, 36};

        System.out.println("Data Sebelum Diurutkan");
        for (int i = 0; i < dataBubble1.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Bubble Sort Ascending");
        BubbleSortAscending(dataBubble1);
        for (int i = 0; i < dataBubble1.length; i++) {
            System.out.print(dataBubble1[i] + " ");
        }
        System.out.println("");
        System.out.println("Bubble Sort Descending");
        BubbleSortDescending(dataBubble2);
        for (int i = 0; i < dataBubble1.length; i++) {
            System.out.print(dataBubble2[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Selection Sort Ascending");
        SelectionSortAscending(dataSelection1);
        for (int i = 0; i < dataBubble2.length; i++) {
            System.out.print(dataSelection1[i] + " ");
        }

        System.out.println("");
        System.out.println("Selection Sort Descending");
        SelectionSortDescending(dataSelection2);
        for (int i = 0; i < dataBubble2.length; i++) {
            System.out.print(dataSelection2[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Insertion Sort Ascending");
        InsertionSortAscending(dataInsertion1);
        for (int i = 0; i < dataSelection1.length; i++) {
            System.out.print(dataInsertion1[i] + " ");
        }

        System.out.println("");
        System.out.println("Insertion Sort Descending");
        InsertionSortDescending(dataInsertion2);
        for (int i = 0; i < dataSelection1.length; i++) {
            System.out.print(dataInsertion2[i] + " ");
        }
    }

    public static int[] BubbleSortAscending(int a[]) {
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

    public static int[] BubbleSortDescending(int a[]) {
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j + 1] > a[j]) {
                    int swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;
                }
            }
        }
        return a;
    }

    public static int[] SelectionSortAscending(int array[]) {
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

    public static int[] SelectionSortDescending(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[min]) {
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

    public static int[] InsertionSortAscending(int[] list) {
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

    public static int[] InsertionSortDescending(int[] list) {
        int holePosition;
        int valueToInsert;
        for (int i = 1; i < list.length; i++) {
            valueToInsert = list[i];
            holePosition = i;
            while (holePosition > 0 && list[holePosition - 1] < valueToInsert) {
                list[holePosition] = list[holePosition - 1];
                holePosition = holePosition - 1;
            }
            list[holePosition] = valueToInsert;
        }
        return list;
    }
}

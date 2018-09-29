/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingObject;

/**
 *
 * @author basisb19
 */
public class Tugas1 {

    public static void main(String[] args) {
        int data[] = {23, 43, 56, 1, 34, 89, 65, 4, 77, 56, 54, 33, 45, 23, 89, 76, 12, 67, 54, 8, 9, 44, 98, 100};
        int dataBubbleAsc[] = {23, 43, 56, 1, 34, 89, 65, 4, 77, 56, 54, 33, 45, 23, 89, 76, 12, 67, 54, 8, 9, 44, 98, 100};
        int dataBubbleDesc[] = {23, 43, 56, 1, 34, 89, 65, 4, 77, 56, 54, 33, 45, 23, 89, 76, 12, 67, 54, 8, 9, 44, 98, 100};
        int dataSelectionAsc[] = {23, 43, 56, 1, 34, 89, 65, 4, 77, 56, 54, 33, 45, 23, 89, 76, 12, 67, 54, 8, 9, 44, 98, 100};
        int dataSelectionDesc[] = {23, 43, 56, 1, 34, 89, 65, 4, 77, 56, 54, 33, 45, 23, 89, 76, 12, 67, 54, 8, 9, 44, 98, 100};
        int dataInsertionAsc[] = {23, 43, 56, 1, 34, 89, 65, 4, 77, 56, 54, 33, 45, 23, 89, 76, 12, 67, 54, 8, 9, 44, 98, 100};
        int dataInsertionDesc[] = {23, 43, 56, 1, 34, 89, 65, 4, 77, 56, 54, 33, 45, 23, 89, 76, 12, 67, 54, 8, 9, 44, 98, 100};

        System.out.println("Kumpulan Data Acak");
        for (int i = 0; i < data.length -2; i++) {
            System.out.print(i+1+" ");
        }
        System.out.println("\n");

        System.out.println("Sorting Bubble Sort Ascending");
        BubbleSortAscending(dataBubbleAsc);
        for (int i = 0; i < dataBubbleAsc.length; i++) {
            System.out.print(dataBubbleAsc[i] + " ");
        }
        System.out.println("");

        System.out.println("Sorting Bubble Sort Descending");
        BubbleSortDescending(dataBubbleDesc);
        for (int i = 0; i < dataBubbleDesc.length; i++) {
            System.out.print(dataBubbleDesc[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Sorting Selection Sort Ascending");
        SelectionSortAscending(dataSelectionAsc);
        for (int i = 0; i < dataSelectionAsc.length; i++) {
            System.out.print(dataSelectionAsc[i] + " ");
        }
        System.out.println("");

        System.out.println("Sorting Selection Sort Descending");
        SelectionSortDescending(dataSelectionDesc);
        for (int i = 0; i < dataSelectionDesc.length; i++) {
            System.out.print(dataSelectionDesc[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Sorting Insertion Sort Ascending");
        InsertionSortAscending(dataInsertionAsc);
        for (int i = 0; i < dataInsertionAsc.length; i++) {
            System.out.print(dataInsertionAsc[i] + " ");
        }
        System.out.println("");

        System.out.println("Sorting Selection Sort Descending");
        InsertionSortDescending(dataInsertionDesc);
        for (int i = 0; i < dataInsertionDesc.length; i++) {
            System.out.print(dataInsertionDesc[i] + " ");
        }
        System.out.println("");
    }

    /**
     * Method pencarian bubble sort Ascending yaitu pencarian dari terkecil
     * hingga terbesar
     *
     * @param array int
     * @return array
     */
    public static int[] BubbleSortAscending(int array[]) {
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        return array;
    }

    /**
     *
     * @param array int
     * @return array
     */
    public static int[] BubbleSortDescending(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] > array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        return array;
    }

    /**
     *
     * @param array int
     * @return array
     */
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

    /**
     *
     * @param array int
     * @return array
     */
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

    /**
     *
     * @param array int
     * @return array
     */
    public static int[] InsertionSortAscending(int[] array) {
        int holePosition;
        int valueToInsert;
        for (int i = 1; i < array.length; i++) {
            valueToInsert = array[i];
            holePosition = i;
            while (holePosition > 0 && array[holePosition - 1] > valueToInsert) {
                array[holePosition] = array[holePosition - 1];
                holePosition = holePosition - 1;
            }
            array[holePosition] = valueToInsert;
        }
        return array;
    }

    /**
     *
     * @param array int
     * @return array
     */
    public static int[] InsertionSortDescending(int[] array) {
        int holePosition;
        int valueToInsert;
        for (int i = 1; i < array.length; i++) {
            valueToInsert = array[i];
            holePosition = i;
            while (holePosition > 0 && array[holePosition - 1] < valueToInsert) {
                array[holePosition] = array[holePosition - 1];
                holePosition = holePosition - 1;
            }
            array[holePosition] = valueToInsert;
        }
        return array;
    }

}

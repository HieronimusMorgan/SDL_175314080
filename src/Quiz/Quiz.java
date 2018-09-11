/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author basisb30
 */
public class Quiz {

    public static void main(String[] args) {
        int a[] = {22, 25, 27, 30, 31, 35, 36, 38, 40};
        cetakArray(a, "Array A");

        int arrayB[] = copytoB(a);
        cetakArray(arrayB, "Array B");

        int arrayC[] = copytoC(a);
        cetakArray(arrayC, "Array C");
        
        int arrayD[] = copytoD(a);
        cetakArray(arrayD, "Array D");


    }

    static void cetakArray(int[] array, String label) {
        System.out.print(label + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    static int[] copytoB(int[] array) {
        int arrayB[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayB[i] = array[i];
        }
        return arrayB;
    }

    static int[] copytoC(int[] array) {
        int arrayC[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayC[i] = array[(array.length - 1) - i];
        }
        return arrayC;
    }

    static int[] copytoD(int[] array) {
        int arrayD[] = new int[array.length];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arrayD[a] = array[i];
                a++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayD[a] = array[i];
                a++;
            }
        }
        return arrayD;
    }
}

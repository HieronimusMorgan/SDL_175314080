/**
 * 
 */
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aldy
 */
public class Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {14, 42, 35, 26, 37, 20, 90, 76, 24, 36, 22, 34, 10};
        Arrays.sort(data);
        for (int i = 0; i < 10; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("Sequential Search");
        System.out.println(" Terdapat pada indeks ke " + sequentialSearch(data, 90));
        System.out.println("Binary Search");
        System.out.println(" Terdapat pada indeks ke " + binarySearch(data, 20));
    }

    public static int sequentialSearch(int[] data, int searchValue) {
        int result = 0;
        for (int i = 0; i < data.length; i++) {
            if (searchValue == data[i]) {
                result = i;
                break;
            } else if (searchValue != data[i]) {
                result = -1;
            }
        }
        System.out.print("Data " + searchValue);
        return result;
    }

    public static int binarySearch(int[] data, int searchValue) {
        int result = 0;
        int batasAwal = 0;
        int batasAkhir = data.length;
        int batasTengah;

        while (batasAwal <= batasAkhir) {
            batasTengah = (batasAwal + batasAkhir) / 2;
            if (data[batasTengah] == searchValue) {
                result = batasTengah;
                break;
            } else if (data[batasTengah] < searchValue) {
                batasAwal = batasTengah + 1;
            } else if (data[batasTengah] > searchValue) {
                batasAkhir = batasTengah - 1;
            }
            result = -1;
        }
        System.out.print("Data " + searchValue);
        return result;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Arrays;

/**
 *
 * @author basisb30
 */
public class InterpolationMethod {

    public static void main(String[] args) {
        int a[] = {9, 21, 32, 38, 51, 59, 68, 80, 91, 97, 113, 119, 131, 142, 149};
        Arrays.sort(a);
        System.out.println("");
        System.out.println("Sequential Search");

        System.out.println("Terdapat pada indeks ke " + InterpolationSearch(a, 91));

    }

    public static int InterpolationSearch(int[] data, int searchValue) {
        int batasAwal = 0;
        int batasAkhir = data.length -1;
        int batasTengah;
        while (data[batasAwal] <= searchValue && data[batasAkhir] >= searchValue) {
   
            batasTengah = batasAwal + ((searchValue - data[batasAwal]) * (batasAkhir - batasAwal))
                    / (data[batasAkhir] - data[batasAwal]);
            if (data[batasTengah] < searchValue) {
                batasAwal = batasTengah + 1;
            } else if (data[batasTengah] > searchValue) {
                batasAkhir = batasTengah - 1;
            } else {
                return batasTengah;
            }
        }
        return -1;

    }
}

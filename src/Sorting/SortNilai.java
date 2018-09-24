/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Scanner;

/**
 *
 * @author Morgan
 */
public class SortNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa  = ");
        int jumlah = input.nextInt();

        Mahasiswa[] mahasiswa = new Mahasiswa[jumlah];
        System.out.println("Bubble Sort Asceding\n");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Data " + (i + 1));
            System.out.print("Nama\t= ");
            String nama = input.next();
            System.out.print("Nilai\t= ");
            int nilai = input.nextInt();
            mahasiswa[i] = new Mahasiswa(nama, nilai);
            System.out.println("");
        }
        System.out.println("Bubble Sort Ascending");
        BubbleSortAscending(mahasiswa);
        System.out.println("\nSorted By Nilai\n");
        System.out.printf("%-8s", "Nama");
        System.out.printf("%-5s", "Nilai\n");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.printf("%-8s", mahasiswa[i].getNama());
            System.out.printf("%-5s", mahasiswa[i].getNilai());
            System.out.println("");
        }
        System.out.println("Bubble Sort Descending");
        BubbleSortDescending(mahasiswa);
        System.out.println("\nSorted By Nilai\n");
        System.out.printf("%-8s", "Nama");
        System.out.printf("%-5s", "Nilai\n");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.printf("%-8s", mahasiswa[i].getNama());
            System.out.printf("%-5s", mahasiswa[i].getNilai());
            System.out.println("");
        }

        System.out.println("\nSelection Sort Descending\n");
        Mahasiswa[] nilai2 = new Mahasiswa[5];
        nilai2[0] = new Mahasiswa("Andi", 50);
        nilai2[1] = new Mahasiswa("Joko", 30);
        nilai2[2] = new Mahasiswa("Rudi", 80);
        nilai2[3] = new Mahasiswa("Anto", 20);
        nilai2[4] = new Mahasiswa("Didi", 10);

        System.out.printf("%-8s", "Nama");
        System.out.printf("%-5s", "Nilai\n");
        for (int i = 0; i < nilai2.length; i++) {
            System.out.printf("%-8s", nilai2[i].getNama());
            System.out.printf("%-5s", nilai2[i].getNilai());
            System.out.println("");
        }

        SelectionSortAscending(nilai2);
        System.out.println("\nData Setelah Diurutkan\n");
        System.out.printf("%-8s", "Nama");
        System.out.printf("%-5s", "Nilai\n");
        for (int i = 0; i < nilai2.length; i++) {
            System.out.printf("%-8s", nilai2[i].getNama());
            System.out.printf("%-5s", nilai2[i].getNilai());
            System.out.println("");
        }
    }

    public static Mahasiswa[] BubbleSortAscending(Mahasiswa nilai[]) {
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai.length - 1; j++) {
                if (nilai[j + 1].compareTo(nilai[j]) < 0) {
                    Mahasiswa swap = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = swap;
                }
            }
        }
        return nilai;
    }

    public static Mahasiswa[] BubbleSortDescending(Mahasiswa nilai[]) {
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai.length - 1; j++) {
                if (nilai[j + 1].compareTo(nilai[j]) > 0) {
                    Mahasiswa swap = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = swap;
                }
            }
        }
        return nilai;
    }

    public static Mahasiswa[] SelectionSortAscending(Mahasiswa[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[min]) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                Mahasiswa swap = a[min];
                a[min] = a[i];
                a[i] = swap;
            }
        }
        return a;
    }

    public static Mahasiswa[] InsertionSortAscending(int[] list, Mahasiswa mahasiswa[]) {
//        int holePosition = 0;
//        Mahasiswa valueToInsert = new Mahasiswa();
//        for (int i = 1; i < list.length; i++) {
//            valueToInsert = mahasiswa[i];
//            holePosition = i;
//            while (holePosition > 0 && mahasiswa[holePosition - 1] > valueToInsert) {
//                mahasiswa[holePosition] = mahasiswa[holePosition - 1];
//                holePosition = holePosition - 1;
//            }
//            mahasiswa[holePosition] = valueToInsert;
//        }
        return mahasiswa;
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
}

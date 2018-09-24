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

//        System.out.println("\nBubble Sort Descending\n");
//        Nilai[] nilai2 = new Nilai[5];
//        nilai2[0] = new Nilai("Andi", 50);
//        nilai2[1] = new Nilai("Joko", 30);
//        nilai2[2] = new Nilai("Rudi", 80);
//        nilai2[3] = new Nilai("Anto", 20);
//        nilai2[4] = new Nilai("Didi", 10);
//
//        System.out.printf("%-8s", "Nama");
//        System.out.printf("%-5s", "Nilai\n");
//        for (int i = 0; i < nilai2.length; i++) {
//            System.out.printf("%-8s", nilai2[i].getNama());
//            System.out.printf("%-5s", nilai2[i].getNilai());
//            System.out.println("");
//        }
//
//        BubbleSortDescending(nilai2);
//        System.out.println("\nData Setelah Diurutkan\n");
//        System.out.printf("%-8s", "Nama");
//        System.out.printf("%-5s", "Nilai\n");
//        for (int i = 0; i < nilai1.length; i++) {
//            System.out.printf("%-8s", nilai2[i].getNama());
//            System.out.printf("%-5s", nilai2[i].getNilai());
//            System.out.println("");
//        }
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

}

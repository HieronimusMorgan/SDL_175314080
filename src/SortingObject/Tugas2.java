/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingObject;

/**
 *
 * @author basisb29
 */
public class Tugas2 {

    public static void main(String[] args) {
        //Membuat array daftarAtlet dengan panjang index 8.
        Atlet daftarAtlet[] = new Atlet[8];
        daftarAtlet[0] = new Atlet("Hong Kong", "To Kenneth", 22.54);
        daftarAtlet[1] = new Atlet("Singapore", "Teong", 22.59);
        daftarAtlet[2] = new Atlet("China", "Yu Hexin", 22.11);
        daftarAtlet[3] = new Atlet("Japan", "Nakamura", 22.20);
        daftarAtlet[4] = new Atlet("Kazakhstan", "Mussin", 22.64);
        daftarAtlet[5] = new Atlet("Japan", "Nakao", 22.46);
        daftarAtlet[6] = new Atlet("Taipei", "Lin", 22.67);
        daftarAtlet[7] = new Atlet("India", "Khade", 22.47);

        System.out.println("====================================");
        System.out.printf("%-15s", "Negara");
        System.out.printf("%-15s", "Nama");
        System.out.printf("%-6s", "Waktu");
        System.out.println("");
        System.out.println("====================================");
        for (int i = 0; i < daftarAtlet.length; i++) {
            System.out.printf("%-15s", daftarAtlet[i].getNegara());
            System.out.printf("%-15s", daftarAtlet[i].getNama());
            System.out.printf("%.2f", daftarAtlet[i].getWaktu());
            System.out.println("");
        }

        System.out.println("\n");
        System.out.println("Sorting Insertion Sort Descending");
        System.out.println("====================================");
        InsertionSortDescending(daftarAtlet);
        System.out.printf("%-15s", "Negara");
        System.out.printf("%-15s", "Nama");
        System.out.printf("%-6s", "Waktu");
        System.out.println("");
        System.out.println("====================================");
        for (int i = 0; i < daftarAtlet.length; i++) {
            System.out.printf("%-15s", daftarAtlet[i].getNegara());
            System.out.printf("%-15s", daftarAtlet[i].getNama());
            System.out.printf("%.2f", daftarAtlet[i].getWaktu());
            System.out.println("");
        }
    }

    public static Atlet[] BubbleSortAscending(Atlet atlet[]) {
        for (int i = 0; i < atlet.length; i++) {
            for (int j = 0; j < atlet.length - 1; j++) {
                if (atlet[j + 1].compareTo(atlet[j]) < 0) {
                    Atlet swap = atlet[j];
                    atlet[j] = atlet[j + 1];
                    atlet[j + 1] = swap;
                }
            }
        }
        return atlet;
    }

    public static Atlet[] BubbleSortDescending(Atlet atlet[]) {
        for (int i = 0; i < atlet.length; i++) {
            for (int j = 0; j < atlet.length - 1; j++) {
                if (atlet[j + 1].compareTo(atlet[j]) > 0) {
                    Atlet swap = atlet[j];
                    atlet[j] = atlet[j + 1];
                    atlet[j + 1] = swap;
                }
            }
        }
        return atlet;
    }

    public static Atlet[] SelectionSortAscending(Atlet[] atlet) {
        for (int i = 0; i < atlet.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < atlet.length; j++) {
                if (atlet[j].compareTo(atlet[min]) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                Atlet swap = atlet[min];
                atlet[min] = atlet[i];
                atlet[i] = swap;
            }
        }
        return atlet;
    }

    public static Atlet[] SelectionSortDescending(Atlet[] atlet) {
        for (int i = 0; i < atlet.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < atlet.length; j++) {
                if (atlet[j].compareTo(atlet[min]) > 0) {
                    min = j;
                }
            }
            if (min != i) {
                Atlet swap = atlet[min];
                atlet[min] = atlet[i];
                atlet[i] = swap;
            }
        }
        return atlet;
    }

    public static Atlet[] InsertionSortAscending(Atlet atlet[]) {
        int holePosition;
        for (int i = 1; i < atlet.length; i++) {
            Atlet valueToInsert = atlet[i];
            holePosition = i;
            while (holePosition > 0
                    && atlet[holePosition - 1].compareTo(valueToInsert) > 0) {
                atlet[holePosition] = atlet[holePosition - 1];
                holePosition = holePosition - 1;
            }
            atlet[holePosition] = valueToInsert;
        }
        return atlet;
    }

    public static Atlet[] InsertionSortDescending(Atlet atlet[]) {
        int holePosition;
        for (int i = 1; i < atlet.length; i++) {
            Atlet valueToInsert = atlet[i];
            holePosition = i;
            while (holePosition > 0
                    && atlet[holePosition - 1].compareTo(valueToInsert) < 0) {
                atlet[holePosition] = atlet[holePosition - 1];
                holePosition = holePosition - 1;
            }
            atlet[holePosition] = valueToInsert;
        }
        return atlet;
    }
}

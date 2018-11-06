/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

import java.util.Scanner;

/**
 *
 * @author basisb23
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int jumlah;

        int i;
        int nomor = 0;
        System.out.println("Masukkan Nilai");
        for (int j = 10; j > 0; j++) {
            System.out.print("Nilai ke-" + (nomor + 1) + " : ");
            i = input.nextInt();
            if (i != -1) {
                list.addLast(i);
                nomor++;
            } else if (i == -1) {
                j = i;
            }
        }

        jumlah = list.getSize();
        int total = 0;
        while (!list.isEmpty()) {
            total += list.removeFirst();
        }
        double rata = total / jumlah;
        System.out.println("Rata - rata Nilai : " + rata);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SenaraiGanda;

/**
 *
 * @author basisb27
 */
public class Test {

    public static void main(String[] args) {
        LinkedList daftarNilai = new LinkedList();
        daftarNilai.addFirst(200);
        daftarNilai.addLast(100);
        daftarNilai.addLast(500);
        System.out.println("Cetak While");
        while (!daftarNilai.isEmpty()) {
            System.out.println(daftarNilai.removeFirst());
        }

        LinkedList daftarNilai1 = new LinkedList();
        daftarNilai1.addFirst(200);
        daftarNilai1.addLast(100);
        daftarNilai1.addLast(500);
        System.out.println("Cetak toString");
        System.out.println(daftarNilai1.toString());

    }
}

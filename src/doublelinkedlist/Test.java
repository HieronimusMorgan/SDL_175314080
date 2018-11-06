/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

/**
 *
 * @author basisb27
 */
public class Test {

    public static void main(String[] args) {

        LinkedList daftarNilai = new LinkedList();

        daftarNilai.addLast(10);
        daftarNilai.addLast(20);
        daftarNilai.addLast(30);

        System.out.println("Daftar Nilai\t: " + daftarNilai.toString());
        ListNode node = daftarNilai.search(200);
        System.out.println("Element 20\t: " + node.getElemen());
        System.out.println("Index Nilai 20\t: " + daftarNilai.search1(node.getElemen()));
        System.out.println("Index ke-2\t: " + daftarNilai.get(2));
        System.out.println("Rata - rata\t: "+daftarNilai.rata());

    }
}

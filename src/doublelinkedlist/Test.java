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
        //Memanggil daftar nilai melalui toString dimana nilai dari daftarNilai tidak menghilang
        ListNode node = daftarNilai.searchElement(20);
        System.out.println("Element 20\t: " + node.getElemen());
        //method search yang me-return node, dengan parameter nilai yang dicari 
        System.out.println("Index Nilai 20\t: " + daftarNilai.searchIndex(node.getElemen()));
        //method search yang me-return int, index ke berapa dari search node 
        //dengan parameter elemen dari node
        System.out.println("Index ke-2\t: " + daftarNilai.get(2));
        //method search yang me-return int,  nilai berapa dari search index
        //dengan parameter index dari node
        ListNode a = daftarNilai.searchElement(20);

        System.out.println("Rata - rata\t: " + daftarNilai.rata());
        //method untuk menghitung rata - rata daftarNilai

        System.out.println(a.getElemen());
    }
}

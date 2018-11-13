/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;


/**
 *
 * @author basisb27
 */
public class LinkedList {

    private ListNode head;
    private int size = 0;

    public LinkedList() {
        head = new ListNode();
        head.setNext(head);
        head.setPrev(head);
    }

    public void addFirst(int data) {

        addBefore(data, head.getNext());
    }

    public void addLast(int data) {

        addBefore(data, head);
    }

    public int removeFirst() {
        int a = remove(head.getNext());
        size--;
        return a;
    }

    public int removeLast() {
        int a = remove(head.getPrev());
        size--;
        return a;
    }

    public ListNode search(int data) {
        ListNode c = head;
        for (int i = 0; i < size; i++) {
            c = c.getNext();
            if (data == c.getElemen()) {
                return c;
            }
        }
        return head;
    }

    public int search1(int data) {
        ListNode c = head;
        int index = -1;
        for (int i = 0; i < size; i++) {
            c = c.getNext();
            index++;
            if (data == c.getElemen()) {
                return index;
            }
        }
        return -1;
    }

    public int get(int data) {
        ListNode c = head;
        int index = -1;
        for (int i = 0; i < size; i++) {
            c = c.getNext();
            index++;
            if (data == index) {
                return c.getElemen();
            }
        }
        return -1;
    }

    public double rata() {
        LinkedList list = this;
        int jumlah = this.getSize();
        int total = 0;
        while (!list.isEmpty()) {
            total += list.removeFirst();
        }
        double rata;
        return rata = total / jumlah;

    }

    private ListNode addBefore(int data, ListNode node) {
        ListNode baru = new ListNode(data);
        node.getPrev().setNext(baru);
        baru.setPrev(node.getPrev());
        baru.setNext(node);
        node.setPrev(baru);
        size++;
        return baru;
    }

    private int remove(ListNode node) {
        ListNode kiri = node.getPrev();
        ListNode kanan = node.getNext();
        kiri.setNext(kanan);
        kanan.setPrev(kiri);
        return node.getElemen();
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        ListNode node = head;
        String a = "";
        int b;
        while (node.getNext() != head) {
            node = node.getNext();
            a = a + node.getElemen() + " ";
        }
        return a;
    }
}

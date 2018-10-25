/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SenaraiTunggal;

/**
 *
 * @author Hieronimus Fredy Morgan
 */
public class ListNode {
    int data;
    ListNode kanan;

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(int data, ListNode kanan) {
        this.data = data;
        this.kanan = kanan;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getKanan() {
        return kanan;
    }

    public void setKanan(ListNode kanan) {
        this.kanan = kanan;
    }  

}

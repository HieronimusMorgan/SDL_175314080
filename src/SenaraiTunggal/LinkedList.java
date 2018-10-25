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
public class LinkedList {
    
    ListNode pertama;
    ListNode terakhir;
    String nama;
    
    public LinkedList() {
        this.pertama = null;
        this.terakhir = null;
    }
    
    public LinkedList(String nama) {
        this.nama = nama;
    }
    
    public void addPertama(int data) {
        ListNode baru = new ListNode(data);
        if (isEmpty()) {
            this.pertama = baru;
            this.terakhir = baru;
        } else {
            baru.setKanan(pertama);
            this.pertama = baru;
        }
        
    }
    
    public void addTerakhir(int data) {
        ListNode baru = new ListNode(data);
        this.terakhir.setKanan(baru);
        this.terakhir = baru;
    }
    
    public ListNode removePertama() {
        if (isEmpty()) {
            return null;
        } else {
            ListNode bantu = this.pertama;
            if (pertama == terakhir) {
                this.pertama = null;
                this.terakhir = null;
            } else {
                this.pertama = this.pertama.getKanan();
                
            }
            return bantu;
        }
    }
    
    public ListNode removeTerakhir() {
        if (isEmpty()) {
            return null;
        } else {
            ListNode bantu = this.pertama;
            if (pertama == terakhir) {
                this.pertama = null;
                this.terakhir = null;
            } else {
                while (bantu.getKanan() != this.terakhir) {
                    bantu = bantu.getKanan();
                }
                this.terakhir = bantu;
                bantu = bantu.getKanan();
                this.terakhir.setKanan(null);
            }
            return bantu;
        }
    }
    
    public boolean isEmpty() {
        if (this.pertama == null) {
            return true;
        } else {
            return false;
        }
        
    }
}

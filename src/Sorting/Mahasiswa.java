/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author Morgan
 */
public class Mahasiswa implements Comparable {

    private String nama;
    private int nilai;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public int compareTo(Object o) {
        Mahasiswa other = (Mahasiswa) o;
        if (this.nilai < other.getNilai()) {
            return -1;
        }
        if (this.nilai > other.getNilai()) {
            return 1;
        }
        return 0;
    }

}

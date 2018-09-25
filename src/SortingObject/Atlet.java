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
public class Atlet implements Comparable {
    private String Negara;
    private String Nama;
    private double  Waktu;

    public Atlet() {
    }


    public Atlet(String Negara, String Nama, double Waktu) {
        this.Negara = Negara;
        this.Nama = Nama;
        this.Waktu = Waktu;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNegara() {
        return Negara;
    }

    public void setNegara(String Negara) {
        this.Negara = Negara;
    }

    public double getWaktu() {
        return Waktu;
    }

    public void setWaktu(double Waktu) {
        this.Waktu = Waktu;
    }

    

    @Override
    public int compareTo(Object o) {
        Atlet other = (Atlet) o;
        if (this.Waktu < other.getWaktu()) {
            return -1;
        }
        if (this.Waktu > other.getWaktu()) {
            return 1;
        }
        return 0;
    }
}

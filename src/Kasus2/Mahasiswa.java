/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus2;

/**
 *
 * @author basisb06la
 */
public class Mahasiswa {

    private String Nama;
    private String NIM;

    public Mahasiswa(String nama, String NIM) {
        this.Nama = nama;
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

}

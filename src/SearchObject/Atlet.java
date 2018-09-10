/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchObject;

/**
 *
 * @author basisb29
 */
public class Atlet implements Comparable {

    private String Nama;
    private int BeratBadan;

    public Atlet() {
    }

    public Atlet(String lastName, int BeratBadan) {
        this.Nama = lastName;
        this.BeratBadan = BeratBadan;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getBeratBadan() {
        return BeratBadan;
    }

    public void setBeratBadan(int BeratBadan) {
        this.BeratBadan = BeratBadan;
    }

    @Override
    public int compareTo(Object o) {

        Atlet other = (Atlet) o;
        if (this.BeratBadan < other.getBeratBadan()) {
            return -1;
        }
        if (this.BeratBadan > other.getBeratBadan()) {
            return 1;
        }
        return 0;
    }
}

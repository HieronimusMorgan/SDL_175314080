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
public class MainClass2 {

    public static void main(String[] args) {
        Atlet at[] = new Atlet[7];
        at[0] = new Atlet("Sigit", 70);
        at[1] = new Atlet("Purwanto", 80);
        at[2] = new Atlet("Rudi", 75);
        at[3] = new Atlet("Rendra", 90);
        at[4] = new Atlet("Edi", 85);
        at[5] = new Atlet("Gusti", 75);
        at[6] = new Atlet("Bambang", 95);
        at[7] = new Atlet("Agung", 85);
        
        Atlet otherAtlet = new Atlet("Joko", 95);

    }

    public static Atlet searchSama(Atlet at[], Atlet a) {
        Atlet result = null;
        for (int i = 0; i < at.length; i++) {
            if (a.compareTo(at[i]) == 0) {
                result = at[i];
                System.out.println(a.getNama() + " Sama " + at[i].getNama());
            } else if (a.compareTo(at[i]) > 0) {
                result = at[i];
                System.out.println(a.getNama() + " Lebih Besar " + at[i].getNama());
            } else if (a.compareTo(at[i]) < 0) {
                result = at[i];
                System.out.println(a.getNama() + " Lebih Kecil " + at[i].getNama());
            }
        }
        return result;
    }
    
}

package SenaraiTunggal;

import java.util.LinkedList;

/**
 *
 * @author HieronimusFredyMorgan
 */
public class Linked {

    public static void main(String[] args) {
        LinkedList TinggiBadan = new LinkedList();

        TinggiBadan.add(150);
        TinggiBadan.add(185);
        TinggiBadan.add(160);
        TinggiBadan.add(168);
        TinggiBadan.add(170);
        TinggiBadan.add(150);

        int Jumlah = 0;
        for (int i = 0; i < TinggiBadan.size(); i++) {
            Jumlah += (int) TinggiBadan.get(i) ;
        }
        double Rerata = Jumlah / TinggiBadan.size();
        System.out.println(Rerata);
    }
}

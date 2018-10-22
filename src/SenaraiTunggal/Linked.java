package SenaraiTunggal;

import java.util.LinkedList;

/**
 *
 * @author HieronimusFredyMorgan
 */
public class Linked {

    public static void main(String[] args) {
        LinkedList daftarNama = new LinkedList();

        daftarNama.add(150);
        daftarNama.add(185);
        daftarNama.add(160);
        daftarNama.add(168);
        daftarNama.add(170);
        daftarNama.add(150);

        int Jumlah = 0;
        for (int i = 0; i < daftarNama.size(); i++) {
            Jumlah = (int) daftarNama.get(i) + Jumlah;
        }
        int Rerata = Jumlah / daftarNama.size();
        System.out.println(Rerata);
    }
}

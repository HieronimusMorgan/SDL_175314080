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
public class Test {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addPertama(8);
        list.addPertama(15);
        list.addTerakhir(26);

        ListNode node;
        while (!list.isEmpty()) {
            node=list.removePertama();
            System.out.println(node.getData());
        }
    }
}

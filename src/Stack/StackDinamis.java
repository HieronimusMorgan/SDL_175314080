/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author basisb21
 */
public class StackDinamis {

    LinkedList elemen;

    public StackDinamis() {
        elemen = new LinkedList();
    }

    public StackDinamis(LinkedList elemen) {
        this.elemen = elemen;
    }

    public void push(int a) {
        elemen.addFirst(a);
    }

    public int pop() {
        return elemen.removeFirst();
    }

    public boolean isEmpty() {
        if (elemen.getSize() == 0) {
            return true;
        }
        return false;
    }

}

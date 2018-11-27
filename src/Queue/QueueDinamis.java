/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author basisb16
 */
public class QueueDinamis {

    private LinkedList antrian;

    public QueueDinamis() {
        antrian = new LinkedList();
    }

    public boolean enqueue(int elemen) {
        antrian.addFirst(elemen);
        return true;
    }

    public int dequeue() {
        return antrian.removeLast();
    }

    public int size() {
        return antrian.getSize();
    }

    public boolean isEmpty() {
        if (antrian.getSize() == 0) {
            return true;
        }
        return false;
    }
}

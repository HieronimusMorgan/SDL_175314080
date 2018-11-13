/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Hieronimus Fredy Morgan / 175314080
 */
public class StackStatis {

    int[] elemen;
    int front;
    int size;

    public StackStatis() {
    }

    public StackStatis(int ukuran) {
        elemen = new int[ukuran];
        size = ukuran;
        front = 0;
    }

    public boolean push(int a) {
        if (size != front) {
            elemen[front] = a;
            front++;
            return true;
        }
        return false;
    }

    public int pop() {
        if (!isEmpty()) {
            size--;
            front--;
            int a = elemen[front];
            return a;
        }
        return 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
}

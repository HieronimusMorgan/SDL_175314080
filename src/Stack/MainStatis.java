/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author basisb16
 */
public class MainStatis {

    public static void main(String[] args) {
        StackStatis a = new StackStatis(10);

        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.push(50);
        a.push(60);
        a.push(70);
        a.push(80);
        a.push(90);
        a.push(100);
        
        while (!a.isEmpty()) {
            System.out.println(a.pop());
        }

    }
}

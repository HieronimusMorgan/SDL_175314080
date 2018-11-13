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
        StackStatis a = new StackStatis(3);

        a.push(3);
        a.push(4);
        a.push(8);
        while(!a.isEmpty()){
            System.out.println(a.pop());
        }

    }
}

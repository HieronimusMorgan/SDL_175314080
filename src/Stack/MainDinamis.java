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
public class MainDinamis {
    public static void main(String[] args) {
        StackDinamis a = new StackDinamis();

        a.push(34);
        a.push(42);
        a.push(87);
        while(!a.elemen.isEmpty()){
            int b = a.pop();
            System.out.println(b);
        }
    }
}

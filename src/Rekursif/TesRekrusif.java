/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursif;

/**
 *
 * @author basisb04
 */
public class TesRekrusif {
    public static void main(String[] args) {
        count(0);
        System.out.println("");
    }
    public static void count(int index) {
        System.out.print(index);
        if(index<2){
            count(index+1);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchObject;

/**
 *
 * @author basisb29
 */
public class MainClass {

    public static void main(String[] args) {
        Employee e = new Employee("Agus", 2000000);
        Employee e2 = new Employee("Seto", 2000000);

        if (e.compareTo(e2) < 0) {
            System.out.println("gaji " + e.getLastName() + " lebih kecil dari " + e2.getLastName());
        } else if (e.compareTo(e2) > 0) {
            System.out.println("gaji " + e.getLastName() + "lebih besar dari " + e.getLastName());
        } else {
            System.out.println("gaji " + e.getLastName() + " dan " + e2.getLastName() + " sama");
        }
    }
}

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
public class MainClass1 {

    public static void main(String[] args) {
        Employee daftarKaryawan[] = new Employee[5];
        daftarKaryawan[0] = new Employee("A", 400);
        daftarKaryawan[1] = new Employee("B", 500);
        daftarKaryawan[2] = new Employee("C", 600);
        daftarKaryawan[3] = new Employee("D", 700);
        daftarKaryawan[4] = new Employee("E", 300);

        Employee otherKaryawan = new Employee("Budi", 300);
        Employee result = search(daftarKaryawan, otherKaryawan);
        if (result != null) {
            System.out.println("gaji " + otherKaryawan.getLastName() + " dan " + result.getLastName() + " sama");
        } else {
            System.out.println("Tidak Ada yang Sama !");
        }
    }

    public static Employee search(Employee[] emp, Employee other) {
        Employee result = null;
        for (Employee emp1 : emp) {
            if (other.compareTo(emp1) == 0) {
                result = emp1;
            }
        }
        return result;
    }
}

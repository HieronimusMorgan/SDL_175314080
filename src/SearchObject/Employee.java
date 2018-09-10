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
public class Employee implements Comparable {

    private String lastName;
    private int salary;

    public Employee() {
    }

    public Employee(String lastName, int salary) {
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o) {

        Employee other = (Employee) o;
        if (this.salary < other.getSalary()) {
            return -1;
        }
        if (this.salary > other.getSalary()) {
            return 1;
        }
        return 0;
    }

}

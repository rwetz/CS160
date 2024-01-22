/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/**
 *
 * @author ryan.wetzstein
 */
public class Employee {

    //instance variables//
    private String name;
    private int ID;
    private double salary;

    //constructor//
    public Employee() {
        name = "Joe Schmoe";
        ID = 12345;
        salary = 37000.00;
    }

    public Employee(String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;

        if (name == null || name.isEmpty()) {
            this.name = "No Name Given";
        }
        if (ID < 0) {
            this.ID = 0;
        } else if (ID > 99999) {
            this.ID = 99999;
        }
        if (salary < 20000.00) {
            this.salary = 20000.00;
        }
    }

    //getters//
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }

    //setters//
    public void setName(String name) {
        this.name = name;
        if (name == null || name.isEmpty()) {
            this.name = "No Name Given";
        }
    }

    public void setID(int ID) {
        this.ID = ID;
        if (ID < 0) {
            this.ID = 0;
        } else if (ID > 99999) {
            this.ID = 99999;
        }

    }

    public void setSalary(double salary) {
        this.salary = salary;
        if (salary < 20000.00) {
            this.salary = 20000.00;
        }
    }

}

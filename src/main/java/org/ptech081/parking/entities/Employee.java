package org.ptech081.parking.entities;

public class Employee {

    public String name;
    public String lastName;
    public long dni;

    //CONTRUCTOR
    public Employee() {
    }

    public Employee(String name, String lastName, long dni) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
    }

}

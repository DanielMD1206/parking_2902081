package org.ptech081.parking.entities;
import java.time.LocalDate;
import java.time.LocalTime;

public class Register {
   
    //ATRIBUTOS INTRINSECOS
    public LocalDate starDate;
    public LocalTime starTime;
    public LocalDate endDate;
    public LocalTime endTime;
    public Long cost;

    //ATRIBUTOS DE RELACION
    public Slot slot;
    public Vehicle vehicle;
    public Employee employee;
    public Customer customer;

    //CONTRUCTOR 
    public Register() {
    }

    public Register(LocalDate starDate, LocalTime starTime, LocalDate endDate, LocalTime endTime, Long cost, Slot slot,
            Vehicle vehicle, Employee employee, Customer customer) {
        this.starDate = starDate;
        this.starTime = starTime;
        this.endDate = endDate;
        this.endTime = endTime;
        this.cost = cost;
        this.slot = slot;
        this.vehicle = vehicle;
        this.customer = customer;
        this.employee = employee;
    }

}

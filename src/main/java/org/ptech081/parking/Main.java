package org.ptech081.parking;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.ptech081.parking.entities.*;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.plate = "ASD456";
        vehicle1.vehicleType = VehicleType.CAMIONETA;
        Vehicle vehicle2 = new Vehicle("ABC123", VehicleType.MOTO);

        //Crear Clientes

        Customer customer1 = new Customer("Daniel", "Gallo", 1019028401L);
        Customer customer2 = new Customer();
        customer2.name = "Andres";
        customer2.lastName = "Meza";
        customer2.dni = 1117964715L;

        customer1.addCar(vehicle2);
        customer2.addCar("ERT789", VehicleType.BUS);

        //RECORRER LOS CARROS DEL CLIENTE 

        Slot slot1 = new Slot('A');
        Slot slot2 = new Slot('B');

        //RECOGER DATOS DEL EMPLEADO

        Employee employee = new Employee("Andres", "Suarez", 8956541216L);

        //CREAR REGISTRO DE ENTRADA Y SALIDA
        LocalDate sDate = LocalDate.now();
        LocalTime sTime= LocalTime.now();
        LocalDate eDate1 = LocalDate.of(2024, Month.MARCH, 15);
        LocalTime eTime1 = LocalTime.of(22, 10, 50);
        LocalDate eDate2 = LocalDate.of(2025, Month.NOVEMBER, 12);
        LocalTime eTime2 = LocalTime.of(12, 40, 10);


        //LISTA DE REGISTRO
        List<Register> myRegisters = new ArrayList<>();
        Register register1 = new Register(sDate, sTime, eDate1, eTime1, 5000L, slot2, customer2.myVehicles.get(0), employee, customer2);

        //CREAR REGISTRO DE E/S 2
        Register register2 = new Register(sDate, sTime, eDate2, eTime2, 3000L, slot1, customer1.myVehicles.get(0), employee, customer1);
        myRegisters.add(register1);
        myRegisters.add(register2);

        System.out.println("Registros de entrada y salida de parking: ");
        for(Register r : myRegisters){
            System.out.println("---------------------------------------------------------------");
            System.out.println("Cliente: " + r.customer.name + " | " + r.customer.lastName + "");
            System.out.println("Empleado: " + r.employee.name + " " + r.employee.dni);
            System.out.println("Vehiculo: " + r.vehicle.vehicleType + " | placa : " + r.vehicle.plate);
            System.out.println("Parqueadero: " + r.slot.slot);
            System.out.println("Precio: " + r.cost);
            System.out.println("Fecha de inicio: " +r.starDate + "\nHora de inicio: " + r.starTime);
            System.out.println("Fecha de salida: " + r.endDate + "\nHora de salida: " + r.endTime);
            System.out.println("---------------------------------------------------------------");
        };

    }
}
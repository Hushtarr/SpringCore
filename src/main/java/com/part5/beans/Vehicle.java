package com.part5.beans;

import com.part5.services.VehicleServices;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicleBean")
@Data
public class Vehicle {

    private String name = "Honda";
    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    public void printHello() {
        System.out.println(
                "Printing Hello from Component Vehicle Bean");
    }

}

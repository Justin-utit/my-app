package com.modernjava.prepare.twenty;

public class Vehicle {
    // Did you notice the protected modifier in Vehicle?
    // We set the brand attribute in Vehicle to a protected access modifier.
    // If it was set to private, the Car class would not be able to access it.
    protected String brand = "Ford";        // Vehicle attribute

    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unguided;

/**
 *
 * @author AZKA_WIDYA
 */
// Kelas Car merepresentasikan mobil yang memiliki mesin dan transmisi
public class Car {
    private String brand;
    private String model;
    private Engine engine;
    private Transmission transmission;

    // Konstruktor untuk inisialisasi mobil
    public Car(String brand, String model, Engine engine, Transmission transmission) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
    }

    // Metode untuk menyalakan mobil
    public void startCar() {
        System.out.println("Starting the car: " + brand + " " + model);
        engine.start();
    }

    // Metode untuk mengemudi dan mengganti gigi
    public void drive(int gear) {
        System.out.println(brand + " " + model + " is now driving.");
        transmission.shiftGear(gear);
    }

    // Metode untuk menampilkan spesifikasi mobil
    public void showSpecs() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Engine Horsepower: " + engine.getHorsepower());
        System.out.println("Fuel Type: " + engine.getFuelType());
        System.out.println("Transmission Type: " + transmission.getType());
        System.out.println("Number of Gears: " + transmission.getGears());
    }
}

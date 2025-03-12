/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unguided;

/**
 *
 * @author AZKA_WIDYA
 */
// Program utama untuk menjalankan simulasi mobil
public class Main {
    public static void main(String[] args) {
        // Membuat objek Engine dan Transmission untuk Rolls-Royce Phantom
        Engine engine = new Engine(563, "Petrol");
        Transmission transmission = new Transmission("Automatic", 8);

        // Membuat objek Car dengan Rolls-Royce Phantom
        Car car = new Car("Rolls-Royce", "Phantom", engine, transmission);

        // Menjalankan fungsi-fungsi utama
        car.startCar();
        car.drive(5);
        car.showSpecs();
    }
}

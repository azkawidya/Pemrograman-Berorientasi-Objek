/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unguided;

/**
 *
 * @author AZKA_WIDYA
 */
public class Engine {
    // Kelas Engine merepresentasikan mesin mobil
    private int horsepower;
    private String fuelType;

    // Konstruktor untuk inisialisasi mesin
    public Engine(int horsepower, String fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    // Getter untuk mendapatkan tenaga mesin
    public int getHorsepower() {
        return horsepower;
    }

    // Getter untuk mendapatkan jenis bahan bakar
    public String getFuelType() {
        return fuelType;
    }

    // Metode untuk menyalakan mesin
    public void start() {
        System.out.println("Engine started with " + horsepower + " HP and fuel type: " + fuelType);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unguided;

/**
 *
 * @author AZKA_WIDYA
 */
public class Transmission {
    // Kelas Transmission merepresentasikan sistem transmisi mobil
    private String type;
    private int gears;

    // Konstruktor untuk inisialisasi transmisi
    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    // Getter untuk mendapatkan tipe transmisi
    public String getType() {
        return type;
    }

    // Getter untuk mendapatkan jumlah gigi
    public int getGears() {
        return gears;
    }

    // Metode untuk mengganti gigi
    public void shiftGear(int gear) {
        if (gear > 0 && gear <= gears) {
            System.out.println("Shifting to gear " + gear + " in " + type + " transmission.");
        } else {
            System.out.println("Invalid gear selection.");
        }
    }
}

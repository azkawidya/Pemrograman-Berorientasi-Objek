/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guided;

/**
 *
 * @author AZKA_WIDYA
 */
public class Mahasiswa {
    // Atribut private untuk menyimpan NIM dan nama mahasiswa
    private String nim;
    private String nama;
    // Atribut protected untuk nilai (dapat diakses oleh subclass)
    protected int nilai;
    
    // Setter
    public void setNama(String nama){
    this.nama = nama;
    }
    public void setNim(String nim){
    this.nim = nim;
    }
    
    // Getter
    public String getNama(){
    return this.nama;
    }
    public String getNim(){
       return this.nim;
       }
    
    // Setter untuk mengatur nilai mahasiswa
    public void setNilai(int nilai){
     this.nilai = nilai;
     }
    
    // Getter untuk mendapatkan nilai mahasiswa
     public int getNilai(){
     return this.nilai;
     }
}

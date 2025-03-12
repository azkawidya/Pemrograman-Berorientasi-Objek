/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guided;

/**
 *
 * @author AZKA_WIDYA
 */
public class Dosen {
    // Atribut private untuk menyimpan kode dan nama dosen
    private String kodeDosen;
    private String namaDosen;
   
    // Setter untuk kode dosen
    public void setKodeDosen(String kodeDosen){
    this.kodeDosen = kodeDosen;
    }
    // Setter untuk nama dosen
    public void setNamaDosen(String namaDosen){
    this.namaDosen = namaDosen;
    }
    //Getter untuk mendapatkan kode dosen
    public String getKodeDosen(){
    return this.kodeDosen;
    }
    // Getter untuk mendapatkan nama dosen
    public String getNamaDosen(){
    return this.namaDosen;
    }
    
    // Metode untuk memberikan nilai kepada mahasiswa
    public void giveScore(Mahasiswa student, int nilai){
    // ini asosiasi, method milik class Student dipanggil di class Dosen,
    // tapi objek Student tidak menjadi atribut dari class Lecture
    student.setNilai(nilai);
    }
    // Metode untuk mendapatkan nilai mahasiswa dari objek Mahasiswa
    public int getScore(Mahasiswa student){
    // ini asosiasi, method milik class Student dipanggil di class Lecture,
    // tapi objek Student tidak menjadi atribut dari class Lecture
    return student.getNilai();
    }
   
    public static void main(String[] args) {
    // Membuat objek Mahasiswa
    Mahasiswa student  = new Mahasiswa();
    // Mengatur NIM dan nama mahasiswa
    student.setNim("130118383");
    student.setNama("Budi");
    // Membuat objek Dosen
    Dosen instructor = new Dosen();
    // Memberikan nilai 90 kepada mahasiswa melalui objek Dosen
    instructor.giveScore(student, 90);
   
    // Menampilkan data mahasiswa dan nilainya
    System.out.println("Nim :"+student.getNim());
    System.out.println("Nama :"+student.getNama());
    System.out.println("Nilai :"+instructor.getScore(student));
    }
}

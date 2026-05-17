/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.data;

/**
 *
 * @author mzida
 */
public record LoginRequest(String usn, String pass) { // parameter otomatis jadi field LoginRequest (costructor) defaultnya final
    
    public LoginRequest{ // constructor
        System.out.println("Membuat Objek LoginRequest");
    }
    
    // Overloading
    public LoginRequest(String usn){
        this(usn, ""); // wajib manggil constructor yg ada di parameter/ utama
    }
    public LoginRequest(){
        this("","");
    }
    
    // bisa buat methods jg aman
    public void sayHello(){
        System.out.println(this.usn);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.application;

import belajarjava5.data.LoginRequest;

/**
 *
 * @author mzida
 */
public class RecordApp {
    public static void main(String[] args) {
        LoginRequest logreq = new LoginRequest("Eko", "Rahasisa");
        
        System.out.println(logreq.usn()); // ini getter
        System.out.println(logreq.pass()); // ini getter
        System.out.println(logreq); // toString methods otomatis
        
        
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Eko"));
        System.out.println(new LoginRequest("Eko", "Rahasia"));
    }
}

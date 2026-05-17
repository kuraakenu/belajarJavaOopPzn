/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.application;

import belajarjava5.error.DatabaseError;

/**
 *
 * @author mzida
 */
public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("eko", null);
        System.out.println("Sukses");
    }
    public static void connectDatabase(String usn, String pass){
        if(usn == null || pass == null){
            throw new DatabaseError("tidak bisa konek database");
        }
    }
}

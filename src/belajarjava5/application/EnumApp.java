/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.application;

import belajarjava5.data.Customer;
import belajarjava5.data.Level;

/**
 *
 * @author mzida
 */
public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Eko");
        customer.setLevel(Level.PREMIUM);
        
        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());
        
        // memanggil nama enum dalam bentuk string
        String levelName = Level.VIP.name();
        System.out.println(levelName);
        
        // mengubah string menjadi objek enum
        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);
        
        // klo pengen ambil semua list levelnya
        System.out.println("Print Level");
        for(var value: Level.values()){
            System.out.println(value);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.application;
import belajarjava5.data.Product;

/**
 *
 * @author mzida
 */
public class Application {
    public static void main(String[] args) {
        Product produk = new Product("Mac Book Pro", 30000000);
        System.out.println(produk.name); // error karna protected bisa akses 1 package
        
        
    }
}

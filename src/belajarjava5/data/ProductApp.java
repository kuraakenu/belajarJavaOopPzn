/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.data;

/**
 *
 * @author mzida
 */
public class ProductApp {
    public static void main(String[] args) {
        
        Product produk = new Product("Mac Book Pro", 30000000);
        System.out.println(produk.name);
        System.out.println(produk.price);
        System.out.println(produk.toString());
        
        System.out.println(produk);
        
        Product produk2 = new Product("Mac Book Pro", 30000000);
        System.out.println(produk.equals(produk2));
        System.out.println(produk.hashCode() == produk2.hashCode());
    }
}

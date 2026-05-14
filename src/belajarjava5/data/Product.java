/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.data;

/**
 *
 * @author mzida
 */
public class Product {
    public String name; // protected = turunannya dan package yg sama
    public int price;
    
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    
    public String toString(){
        return "Product name: " + name + ", price: " + price;
    }
}

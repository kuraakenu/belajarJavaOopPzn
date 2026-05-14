/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.data;

import java.util.Objects;

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
    
    @Override
    public String toString(){
        return "Product name: " + name + ", price: " + price;
    }

    
    
    
//    ini manual
//    @Override 
//    public boolean equals(Object o){
//        if(o == this){
//            return true;
//        }
//        
//        if(o instanceof Product){
//            return false;
//        }
//        
//        Product product = (Product) o;
//        
//        if(this.price != product.price){
//            return false;
//        }
//        
//        if(this.name == null){
//            return this.name.equals(product.name);
//        }else{
//            return product.name == null;
//        }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }


}

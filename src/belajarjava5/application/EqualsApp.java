/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.application;

/**
 *
 * @author mzida
 */
public class EqualsApp {
    
    public static void main(String[] args) {
        String first = "Eko";
        first = first + " " + "Khannedy";
        
        System.out.println(first);
        
        String second = "Eko Khannedy";
        System.out.println(second);
        
        System.out.println(first == second); 
        System.out.println(first.equals(second)); 
        
        String third = "Eko Khannedy";
        System.out.println(third);
        
        System.out.println(second == third);
        System.out.println(second.equals(third));
        
    }
    
}

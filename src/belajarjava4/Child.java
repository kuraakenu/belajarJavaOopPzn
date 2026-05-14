/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava4;

/**
 *
 * @author mzida
 */
public class Child extends Parent{
    // Variable Hiding Class Parent
    String name;
    
    @Override
    void doIt(){
        System.out.println("Do it from Child");
        System.out.println("Parent name is: " + super.name);
    }
}

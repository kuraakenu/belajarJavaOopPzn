/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava2;

/**
 *
 * @author mzida
 */
public class Employee {
    String name;
    
    Employee(String name){
        this.name = name;
    }
    
    void sayHi(String name){
        System.out.println("Hi " + name + ", My Name is Employee " + this.name);
    }
}

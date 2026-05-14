/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava2;

import belajarjava1.*;

/**
 *
 * @author mzida
 */
class Manager extends Employee{
    
    String company;
    
    Manager(String name){
        super(name);
    }
    
    Manager(String name, String company){
        super(name);
        this.company = company;
    }
    
    @Override
    void sayHi(String name){
        System.out.println("Hi VP " + name + ", My Name is Manager " + this.name);
    }
}

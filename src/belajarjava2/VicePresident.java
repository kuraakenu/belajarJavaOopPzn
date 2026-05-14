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
class VicePresident extends Manager{
    
    public VicePresident(String name) {
        super(name); // akses parent
    }
    
    @Override
    void sayHi(String name){
        System.out.println("Hi Manager " + name + ", My Name is VP " + this.name);
    }
}

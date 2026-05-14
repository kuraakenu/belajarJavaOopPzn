/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava1;

/**
 *
 * @author mzida
 */
class Person {
    // Attribute
    
    String name;
    String address;
    final String country = "Indonesia"; 
    
    
    // Constructor
    Person(String name, String address){
        // name = name // ini terjadi variable shadowing
        this.name = name; // this merepresentasikan objek saat ini atau akses objek saat ini
        this.address = address;
    }
    
    // Constructor Overloading
    Person(String name){
//        this.name = name;
        this(name, null); // Constructor Overloading tapi manggil Constructor Awal
    }
    Person(){
        this(null); // Constructor Overloading tapi manggil Constructor Single Parameter
    }
    

    // Methods
    
    void sayHello(){
        this.sayHello("Bos");
    }
    
    void sayHello(String name){
        System.out.println("HeLLO " + name + ", My name is " + this.name);
    }
}

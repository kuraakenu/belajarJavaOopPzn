/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajarjava1;

/**
 *
 * @author mzida
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        person1.name = "Jokos";
//        person1.address = "Solos";
//        System.out.println(person1.name + person1.address);
        
        Person person1 = new Person("Joko", "Solo");
        Person person2 = new Person(); //gk error karna const. overloading
        person2.name = "Wowok";
        person2.address = "Oslo";
        
        person1.sayHello(person2.name);
        person2.sayHello(person1.name);
        person1.sayHello();
    }
    
}

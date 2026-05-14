/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.application;

import belajarjava5.data.HelloWorld;

/**
 *
 * @author mzida
 */
public class HelloWorldApp {
    public static void main(String[] args) {
        
        // ini biasanya instansiasinya, perlu class SampleHelloWorld
//        HelloWorld hw = new SampleHelloWorld();

        // Anonymous Class (gabisa direuse)
        HelloWorld eng = new HelloWorld(){
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
            
        };

        
        eng.sayHello();
        eng.sayHello("Eko");
    }
}

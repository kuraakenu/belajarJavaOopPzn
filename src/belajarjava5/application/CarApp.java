/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.application;

import belajarjava5.data.*;

/**
 *
 * @author mzida
 */
public class CarApp {
    public static void main(String[] args) {
        // ini polymorphism jg
        Car car = new Avanza();
        
        System.out.println("Ban mobilnya ada " + car.getTire());
        car.drive();
    }
    
}

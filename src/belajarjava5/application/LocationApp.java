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
public class LocationApp {
    public static void main(String[] args) {
//        var location = new Location(); abstract class tidak bisa di instansiasi
        var City = new City();
        City.name = "Jakarta";
        System.out.println(City.name);
    }
}

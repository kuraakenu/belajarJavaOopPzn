/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.data;

/**
 *
 * @author mzida
 */
public class Avanza implements Car{
//public class Avanza implements Car, isMaintenance{ // ini bisa gini jg

    @Override
    public void drive() {
        System.out.println("Avanza is driving...");
    }

    @Override
    public int getTire() {
      return 4;
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
    
    /**
     *
     * @return
     */
    @Override
    public boolean isBig(){
        return false;
    }
}

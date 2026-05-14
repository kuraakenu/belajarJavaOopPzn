/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package belajarjava5.data;

/**
 *
 * @author mzida
 */
public interface Car extends HasBrand , isMaintenance{
    void drive();
    int getTire();
    
    default boolean isBig(){
        return false;
    }
}

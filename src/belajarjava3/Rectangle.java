/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava3;

/**
 *
 * @author mzida
 */
public class Rectangle extends Shape{
    
    @Override
    int getCorner(){
        return 4;
    }
    
    int getParentCorner(){
        return super.getCorner();
    }
}

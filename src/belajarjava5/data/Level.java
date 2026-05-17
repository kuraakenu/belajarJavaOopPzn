/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package belajarjava5.data;

/**
 *
 * @author mzida
 */
public enum Level {
    STANDARD("Standart Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");
    
    private String description;
    
    Level(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return description;
    }
}

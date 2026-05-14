/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.application;

//import belajarjava5.data.*;
import belajarjava5.data.Application;
import belajarjava5.utils.MathUtil;
import static belajarjava5.data.Constant.*;
import belajarjava5.data.Country;

/**
 *
 * @author mzida
 */
public class StaticApp {
    public static void main(String[] args) {
        // ini karna import static
//        System.out.println(Constant.APPLICATION);
//        System.out.println(Constant.VERSION);
        System.out.println(APPLICATION);
        System.out.println(VERSION);
        
        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );
        
        
        Country.City city = new Country.City();
        city.setName("Subang");
        
        System.out.println(Application.PROCESSORS);
        
    }
}

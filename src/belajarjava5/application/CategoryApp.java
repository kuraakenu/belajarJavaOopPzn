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
public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        
        category.setId("ID");
        System.out.println(category.getId());
        category.setId(null);
        System.out.println(category.getId());
        category.setId("1");
        System.out.println(category.getId());
//        System.out.println(category.isExpensive());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava4;

/**
 *
 * @author mzida
 */
public class Main4 {
    public static void main(String[] args) {
        // variable hiding
        Child child = new Child();
        child.name = "Eko";
        child.doIt();
        System.out.println(child.name);
        
        Parent parent = (Parent) child;
//        parent.name = "Budi";
        parent.doIt();
        System.out.println(parent.name);
    }
}

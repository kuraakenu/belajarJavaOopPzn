/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.application;

import belajarjava5.data.LoginRequest;
import belajarjava5.error.ValidationException;
import belajarjava5.utils.ValidationUtil;

/**
 *
 * @author mzida
 */
public class ValidationApp {
    public static void main(String[] args){
        LoginRequest loginRequest = new LoginRequest(null, null);
        
//        try{
//            ValidationUtil.validate(loginRequest); // klo ini tidak valid
//            System.out.println("Data Valid"); // ini gk akan di eksekusi
//        }catch(ValidationException e){
//            System.out.println("Data Tidak Valid " + e.getMessage());
//        }catch(NullPointerException e){
//            System.out.println("Data Null " + e.getMessage());
//        }
        
        
        try{
            ValidationUtil.validate(loginRequest); // klo ini tidak valid
            System.out.println("Data Valid"); // ini gk akan di eksekusi
        }catch(ValidationException | NullPointerException e){
            System.out.println("Data Tidak Valid : " + e.getMessage());
        }finally{
            System.out.println("Selalu di Eksekusi");
        }
        
        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2); // klo gda trycatch programnya ttp akan mati 
        System.out.println("Sukses");// ini gk bakal tampil
        
    }
}

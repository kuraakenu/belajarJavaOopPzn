/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.application;

/**
 *
 * @author mzida
 */
public class StackTraceApp {
    public static void main(String[] args) {
        try{
            sampleError();
        }catch(RuntimeException e){
            e.printStackTrace();
        }
    }
    
    public static void sampleError(){
        try{
            String[] names = {
                "Eko", "Kurniawan", "Khannedy"
            };
            
            System.out.println(names[100]);
        }catch(Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}

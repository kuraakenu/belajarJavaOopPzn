/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mzida
 */
public class ReadApp {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // manual 
        
//        BufferedReader reader = null;
//        
//        try{
//            reader = new BufferedReader(
//                    new FileReader("C:\\Users\\mzida\\OneDrive\\Dokumen\\codeLearning\\123240082\\BelajarJava1\\src\\README.md")
//            );
//            
//            while(true){
//                String line = reader.readLine();
//                if(line == null){
//                    break;
//                }
//                    System.out.println(line);
//            }
//        }catch(Throwable t){
//            System.out.println("Error membaca file "+ t.getMessage());
//        }finally{
//            if(reader != null){
//                try{
//                    reader.close();
//                    System.out.println("Sukses menutup");
//                }catch(IOException e){
//                     System.out.println("Error menutup resource " + e.getMessage());
//                }
//            }   
//        }



        //auto 
        
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\mzida\\OneDrive\\Dokumen\\codeLearning\\123240082\\BelajarJava1\\src\\README.md"))){
            while(true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                    System.out.println(line);
            }
        }catch(Throwable t){
                System.out.println("Error membaca file "+ t.getMessage());
        }
        
    }
}

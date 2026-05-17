/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.error;

/**
 *
 * @author mzida
 */
public class ValidationException extends Throwable{
//    private String message; // mau bikin sendiri setter getternya dan constructornya jg bisa
    
    public ValidationException(String message){
        super(message); // gk bikin dan tinggal kirim data messagenya ke methods parentnya jg bisa
    }
}

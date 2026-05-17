/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava5.utils;

import belajarjava5.data.LoginRequest;
import belajarjava5.error.BlankException;
import belajarjava5.error.ValidationException;

/**
 *
 * @author mzida
 */
public class ValidationUtil {
    
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{
        if(loginRequest.usn() == null){
            throw new NullPointerException("Username is NULL");
        }else if(loginRequest.usn().isBlank()){
            throw new ValidationException("Username is Blank");
        }else if(loginRequest.pass() == null){
            throw new NullPointerException("Password is NULL");
        }else if(loginRequest.pass().isBlank()){
            throw new ValidationException("Password is Blank");
        }
    }
    
    public static void validateRuntime(LoginRequest loginRequest){
        if(loginRequest.usn() == null){
            throw new NullPointerException("Username is NULL");
        }else if(loginRequest.usn().isBlank()){
            throw new BlankException("Username is Blank");
        }else if(loginRequest.pass() == null){
            throw new NullPointerException("Password is NULL");
        }else if(loginRequest.pass().isBlank()){
            throw new BlankException("Password is Blank");
        }
    }
}

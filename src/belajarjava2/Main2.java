/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajarjava2;

/**
 *
 * @author mzida
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Manager m = new Manager("Sulis");
//        VicePresident vp = new VicePresident("Tiyo");
//        
//        
//        m.sayHi(vp.name);
//        vp.sayHi(m.name);
        
        // Polymorphism
//        Employee employee = new Employee("Rahmat");
//        employee.sayHi("Eko");
        
        
//        employee = new Manager("Eko");
//        employee.sayHi("Budi");
        
        
//        employee = new VicePresident("Budi");
//        employee.sayHi("Rahmat");
        
        sayHello(new Employee("Jokowi"));
//        sayHello(new Manager("Prabowo"));
//        sayHello(new VicePresident("Teddy"));
        
        
    }
    
    static void sayHello(Employee employee){
        // type check and cast
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + employee.name);
        }else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + employee.name);
        }else{
            System.out.println("Hello " + employee.name);
        }
    }
}

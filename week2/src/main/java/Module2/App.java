/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module2;

/**
 *
 * @author Jtooleyful
 */
public class App {
    public static void main(String[] args) {
        Car myRide = new Car();
        myRide.setMake("Toyota");
        myRide.setModel("corolla");
        myRide.setYear(1998);
        String make = myRide.getMake();
       String model = myRide.getModel();
       int year = myRide.getYear();
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
        
        myRide.engineStart();
        myRide.engineStop();
        
        Car myRide2 = new Car("Audi", "R800", 2016);
        myRide2.getMake();
        myRide2.getModel();
        myRide2.getYear();
        System.out.println(myRide2.getMake());
        System.out.println(myRide2.getModel());
        System.out.println(myRide2.getYear());
        myRide2.engineStart();
        myRide2.engineStop();
        
        IceCream flavour1 = new IceCream();
        flavour1.setFlavor("butter pecan");
        flavour1.getFlavor();
        System.out.println(flavour1.getFlavor());
        
        IceCream flavour2 = new IceCream("cinnamon swirl");
        flavour2.getFlavor();
        System.out.println(flavour2.getFlavor());
        
        Square square1 = new Square();
        square1.getArea(5, 5);
        square1.getPerimeter(5);
        System.out.println(" The area of the square is " + square1.getArea(5, 5));
        System.out.println(" The perimeter of the square is " + square1.getPerimeter(5));
    }
 
}

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
/*car has to have make year model, each requires getters and setters
car needs 2 methods, start engine, stop engine
create a constructor make year  and model
*/
public class Car {
    private String make;
    private String model;
    private int year;
    
    public Car(){
        
    }
    public Car(String makeIn, String modelIn, int yearIn){
        this.make = makeIn;
        this.model = modelIn;
        this.year = yearIn;
    }
    
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }
    
        public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    
        public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    
    public void engineStart(){
        System.out.println("Vrooooom");
    }
    
        public void engineStop(){
        System.out.println("skkkrrtttt");
    }
}

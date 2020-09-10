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
public class IceCream {
    private String flavor;
    
    public IceCream(){
        
    }
    
    public IceCream( String flavorIn){
        this.flavor = flavorIn;
    }
    
    public String getFlavor(){
        return flavor;
    }
    
    public void setFlavor(String flavor){
        this.flavor = flavor;
    }
}

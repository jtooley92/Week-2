/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Jtooleyful
 */
public class StateCapitols {
    public static void main(String[] args) {
        Map<String, String> capitols = new HashMap<>();
        
        capitols.put("Alabame", "Montgomery");
        capitols.put("Alaska", "Juneau");
        capitols.put("Arizona", "Phoenix");
        capitols.put("Arkansas", "Little Rock");
        
            System.out.println("States:");
        Set<String> stateLocations = capitols.keySet();
        for (String states : stateLocations){
            System.out.println(states);
        }
            System.out.println("Capitols:");        
        for (String states : stateLocations){
            System.out.println(capitols.get(states));
        }
         for (String states : stateLocations){
             System.out.println("The capitol of " + states + " is " + capitols.get(states) );
         }
    }
}

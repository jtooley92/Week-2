/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Jtooleyful
 */
public class StateCapitols2 {

    public static final String Delimit = "::";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader("StateCapitols.txt"));
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Map<String, String> stateCapitols = new HashMap<>();
        
        System.out.println("%0 states & Capitals are loaded.");
        System.out.println("=======");
        System.out.println("HERE ARE THE STATES: ");
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            String[] parts = currentLine.split(Delimit);
            stateCapitols.put(parts[0], parts[1]);
            System.out.println(parts[0]);
        }
        System.out.println("Ready to test Your Knowledge? please enter a state then it's capital");
        String state = input1.nextLine();
        String capital = input2.nextLine();
        if (capital.equals(stateCapitols.get(state))) {
            System.out.println("NICE WORK " + capital + " is the capital of " + state);
        }
        }
    }


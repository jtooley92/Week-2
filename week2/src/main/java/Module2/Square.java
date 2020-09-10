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
public class Square implements Shape{

    @Override
    public int getArea(int sideA,int sideB) {
       return sideA * sideB;
    }

    @Override
    public int getPerimeter(int sideLength) {
        return sideLength * 4;
    }
    
}

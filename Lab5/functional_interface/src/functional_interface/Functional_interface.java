/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functional_interface;

/**
 *
 * @author user1
 */

interface Drawable {
    public void draw();
}

interface Circle {
    public void circle(float radius);
}


@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class Functional_interface {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        int width = 10;
        
        // with lambda
        Drawable d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
        
        // lambda expression with single parameter
        Circle c = (float r) -> {
            System.out.println("Area of circle : " + r * r * 3.14 + " sq unit");
        };
        c.circle(5);
        
        
        // lambda expression with multiple parameters
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation substraction = (int a, int b) -> a - b;
        MathOperation multiplication = (int a, int b) -> a * b;
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 25 = " + operate(10, 25, addition));
        System.out.println("10 - 25 = " + operate(10, 25, substraction));
        System.out.println("10 * 25 = " + operate(10, 25, multiplication));
        System.out.println("10 / 25 = " + operate(10, 25, division));
    }   
    
    static private float operate (int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
    
    
}

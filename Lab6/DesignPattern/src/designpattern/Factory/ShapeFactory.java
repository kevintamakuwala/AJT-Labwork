/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Factory;

import java.awt.*;

/**
 *
 * @author user1
 */

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square");
    }
}

public class ShapeFactory {
//
//    ShapeFactory() {
//        setVisible(true);
//        setSize(1220, 1200);
//    }
//    @Override
//    public void paint(Graphics g){
//        
//    }
    

    public Shape getShape(String shape) {

        String s = shape.toLowerCase();

        switch (s) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}

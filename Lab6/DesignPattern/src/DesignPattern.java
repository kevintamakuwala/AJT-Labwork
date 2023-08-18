/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import designpattern.Builder.*;
import designpattern.Factory.Shape;
import designpattern.Factory.ShapeFactory;
import java.awt.Frame;
import java.util.Scanner;

/**
 *
 * @author user1
 */
public class DesignPattern extends Frame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (true) {
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    try {
                        ShapeFactory shapeFactory = new ShapeFactory();
                        Shape shape = shapeFactory.getShape("square");
                        shape.draw();
                    } catch (NullPointerException e) {
                        System.out.println("Enter a valid Shape\n");
                    } catch (Exception e) {
                        System.out.println("Something went Wrong\n");
                    }
                    break;
                case 2:
                    Computer cb = new ComputerBuilder().setGraphics("AMD RADEON").setProcessor("AMD RYZEN 5").setRam(4).setStorage(512).computerBuilder();
                    cb.printConfiguration();
                    break;
                case 4:
                    flag = true;
                    break;
                default:
                    break;

            }
            if (flag) {
                break;
            }
        }
    }
}

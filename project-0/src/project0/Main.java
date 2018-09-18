/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enneacle
 */
import java.util.*;
public class Main {
    
    public static void main(String[] args){
        
        // ---Main Scanner---
        Scanner kb = new Scanner(System.in);
        
        // ---Square---
        System.out.println("Enter the two dimensions for the square: ");
        int sq1 = kb.nextInt();
        int sq2 = kb.nextInt();
        Square square = new Square("Square");
        square.setDimensions(sq1, sq2);
        System.out.println(square.getName());
        System.out.print("Current dimension: ");
        square.printDimensions();
        System.out.println("Area: "+square.getArea());
        System.out.println("");
        
        // ---Circle---
        System.out.println("Enter radius of the circle: ");
        int radius = kb.nextInt();
        Circle circle = new Circle("Circle");
        circle.setDimensions(radius);
        System.out.println(circle.getName());
        System.out.print("Current radius: ");
        circle.printDimensions();
        System.out.println("Area: "+circle.getArea());
        System.out.println("");
        
        // ---Triangle---
        System.out.println("Enter three side lengths for the triangle: ");
        int length1 = kb.nextInt();
        int length2 = kb.nextInt();
        int length3 = kb.nextInt();
        Triangle triangle = new Triangle("Triangle");
        triangle.setDimensions(length1, length2, length3);
        System.out.println(triangle.getName());
        System.out.print("Current side lengths: ");
        triangle.printDimensions();
        System.out.println("Area: "+triangle.getArea());
        System.out.println("");
        
        // ---Equilateral Triangle---
        System.out.println("Enter length to three sides for the equilateral triangle: ");
        int length = kb.nextInt();
        EquilateralTriangle eqTriangle = new EquilateralTriangle("Equilateral Triangle");
        eqTriangle.setDimensions(length);
        System.out.println(eqTriangle.getName());
        System.out.print("Current length of three sides: ");
        eqTriangle.printDimensions();
        System.out.println("Area: "+eqTriangle.getArea());
        System.out.println("");
    }
}

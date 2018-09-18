/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enneacle
 */
public class Circle extends Shape{
    
    int radius;
    
    public Circle(String name) {
        super(name);
    }
    
    public void setDimensions(int x){
        this.radius = x;
    }
    
    public void printDimensions(){
        System.out.println(this.radius);
    }
    
    public double getArea(){
        return Math.PI*(radius*radius);
    }
    
}

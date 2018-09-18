/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enneacle
 */
public class Triangle extends Shape{
    
    int length1, length2, length3;
    
    public Triangle(String name) {
        super(name);
    }
    
    public void setDimensions(int x, int y, int z){
        this.length1 = x;
        this.length2 = y;
        this.length3 = z;
    }
    
    public void printDimensions(){
        System.out.println(this.length1+", "+this.length2+", "+this.length3);
    }
    
    public double getArea(){
        double result;
        double s = (this.length1+this.length2+this.length3)/2.0d;
        result = Math.sqrt(s*(s-this.length1)*(s-this.length2)*(s-this.length3));
        return result;
    }
    
}

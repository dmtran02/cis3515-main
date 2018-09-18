/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enneacle
 */
public class EquilateralTriangle extends Triangle{
    
    int length;
    
    public EquilateralTriangle(String name) {
        super(name);
    }
    
    public void setDimensions(int x){
        this.length = x;
    }
    
    public void printDimensions(){
        System.out.println(this.length);
    }
    
    public double getArea(){
        double result;
        double s = (this.length+this.length+this.length)/2.0d;
        result = Math.sqrt(s*(s-this.length)*(s-this.length)*(s-this.length));
        return result;
    }
    
}

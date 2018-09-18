/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enneacle
 */
public class Square extends Shape{
    
    int length;
    int height;
    
    public Square(String name) {
        super(name);
    }
    
    public void setDimensions(int x, int y){
        this.length = x;
        this.height = y;
    }
    
    public void printDimensions(){
        System.out.println("Length: "+this.length + " and Width: "+this.height);
    }
    
    public double getArea(){
        return this.length * this.height;
    }
    
}

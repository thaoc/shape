/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;


/**
 *
 * @author Mike nelsonm25@csp.edu
 */
public class Rectangle implements IShape {
    private double height;
    private double width;
    public Rectangle(double h, double w) {
        this.height = h;
        this.width = w;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public double getWidth() {
        return this.width;
    }

    public void setHeight(double h) {
        this.height = h;
    }
    
    public void setWidth(double w) {
        this.width = w;
    }
    
    @Override
    public double getArea() {
        return this.getHeight() * this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return (this.getHeight() * 2) + (this.getWidth() * 2);
    }
}

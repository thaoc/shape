
package shapes;


public class Main {
    
    public static void main(String[] args){
        IShapeFactory f = new ShapeFactory();
        
        f.createShape("square");
        f.createShape("rectangle");
    }

}

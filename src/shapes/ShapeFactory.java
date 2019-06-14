
package shapes;


public class ShapeFactory implements IShapeFactory{

    @Override
    public IShape createShape(String type) {
        switch(type){
            case "rectangle" : return new Rectangle(4,5);
            case "square": return new Square(5);
        }
        return null;
    }

}

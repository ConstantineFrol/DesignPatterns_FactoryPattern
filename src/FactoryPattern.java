public class FactoryPattern {

    // Main method
    public static void main(String[] args) {

        // Create an object of class ShapeFactory
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an Object of Rectangle and call its draw() method
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        // Get an Object of Square and call its draw() method
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        // Get an Object of Circle and call its draw() method
        Shape shape3 = shapeFactory.getShape("CIRCLE");
        shape3.draw();
    }
}

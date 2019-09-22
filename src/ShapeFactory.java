public class ShapeFactory {

    /* Depends on passing parameter this method will return null
     * or the Object(Constructor of specific class)
     */
    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }

        return null;
    }
}

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println(
                "Method draw() was called" +
                "from java class Rectangle.java"
        );
    }
}
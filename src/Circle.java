public class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println(
                "Method draw() was called" +
                        "from java class Circle.java"
        );
    }
}

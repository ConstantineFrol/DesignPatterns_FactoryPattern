public class Square implements Shape{
    @Override
    public void draw(){
        System.out.println(
                "Method draw() was called" +
                        "from java class Square.java"
        );
    }
}

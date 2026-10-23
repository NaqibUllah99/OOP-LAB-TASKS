class Shape{
    void draw(){
        System.out.print("drawing a shape");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.print("drawing a circle");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape shape =new Circle();
        shape.draw();

    }
}

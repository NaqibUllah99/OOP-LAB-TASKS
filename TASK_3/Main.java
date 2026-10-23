class Area{
    int area(int side){

        return side*side;
    }
    int area(int length,int width) {
        return length*width;
    }
}

public class Main {
    public static void main(String[] args) {
        Area tool= new Area();
        System.out.println(tool.area(2));
        System.out.println(tool.area(2, 3));

    }
}

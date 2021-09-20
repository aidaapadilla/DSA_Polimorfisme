import java.math.MathContext;

class Triangle extends Figure
{
    double base;
    double height;
    public Triangle(double base, double height)
    {
        this.base=base;
        this.height=height;
    }

    @Override
    public void area(double base, double height) {
        super.area(base, height);
    }
}
class Square extends Rectangle
{
    int costat;
    public Square(int costat)
    {
        super(costat,costat);
    }
}
class Rectangle extends Figure
{
    int baseR;
    int heightR;
    public Rectangle(int baseR, int heightR)
    {
        this.baseR=baseR;
        this.heightR=heightR;
    }

    @Override
    public void area(int baseR, int heightR) {
        super.area(baseR, heightR);
    }
}
class Circle extends Figure
{
    int radius;
    public Circle(int radius)
    {
        this.radius=radius;
    }
    @Override
    public void area(int radius) {
        super.area(radius);
    }
}
class Figure
{
    public void area(int radius)
    {
        //Circle area
        System.out.println("Circle area ="+Math.PI*radius*radius); //Buscar com fer al quadrat
    }

    public void area(double base, double height)
    {
        //Triangle area
        System.out.println("Triangle area ="+(base*height)/2);
    }
    public void area(int baseR, int heightR)
    {
        //Rectangle area
        System.out.println("Rectangle area ="+(baseR*heightR)/2);
    }

}
public class main {
    public static void main(String[] args)
    {
        Figure circle = new Circle(3);
        Figure rectangle = new Rectangle(2,4);
        Figure square = new Square(5);
        Figure triangle = new Triangle(2.1,5.2);

        circle.area(3);
        rectangle.area(2,4);
        square.area(5,5); //No funciona amb la area del quadrat
        triangle.area(2.1,5.2);
    }
}

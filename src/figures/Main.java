package figures;

public class Main {
    public static void main(String[] args) {
        Polygon square1 = new Square(5.22d, 3.91);
        Polygon triangle1 = new Triangle(3, 4, 5 );
        ClosedCurves circle1 = new Circle(6);
        VolumePolygon cubical1 = new Parallelepiped(3, 5, 8.91);
        Sphericals sphere1 = new Sphere(18);

        HasArea[] shapes = {square1, triangle1, circle1, cubical1, sphere1};

        area(shapes);
    }

    public static void area(HasArea ... shapes) {
        for (HasArea shape : shapes){
            System.out.println(shape.shapeName() + "area: ");
            System.out.println(shape.area());
        }
    }

    public static void perimeter(HasPerimeter ... shapes) {
        for (HasPerimeter shape : shapes){
            System.out.println(shape.shapeName() + "perimeter: ");
            System.out.println(shape.perimeter());
        }
    }

}

package figures;
import java.lang.Math;

public class Triangle extends Polygon{

    private double sideC;
    private final String name = "Triangle";

    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB);
        this.sideC = sideC;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public double area(){
        double halfP = (getSideA() + getSideB() + sideC)/2.0;
        Double area = Math.sqrt(halfP*(halfP - getSideA())*(halfP - getSideB())*(halfP - sideC));
        if (area.isNaN()){
            System.out.println("Undefined triangle");
            return 0.0f;
        }
        return area;
    }

    @Override
    public double perimeter(){
        return getSideA() + getSideB() + sideC;
    }

    @Override
    public String shapeName() {
        return name;
    }
}

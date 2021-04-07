package figures;

public class Square extends Polygon{

    public Square(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    public String shapeName(){
        return "Square";
    }
}

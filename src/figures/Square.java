package figures;

public class Square extends Polygon{

    private final String name = "Square";

    public Square(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    public String shapeName(){
        return name;
    }
}

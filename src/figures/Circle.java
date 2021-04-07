package figures;

public class Circle extends ClosedCurves{

    public Circle(float radius) {
        super(radius);
    }

    @Override
    public String shapeName() {
        return "Circle";
    }
}

package figures;

public class Circle extends ClosedCurves{

    private final String name = "Circle";

    public Circle(float radius) {
        super(radius);
    }

    @Override
    public String shapeName() {
        return name;
    }
}

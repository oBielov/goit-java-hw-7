package figures;

public class Sphere extends Sphericals{

    private final String name = "Sphere";

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public String shapeName() {
        return name;
    }
}

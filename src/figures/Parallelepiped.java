package figures;

public class Parallelepiped extends VolumePolygon{

    private final String name = "Parallelepiped";

    public Parallelepiped(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public String shapeName() {
        return name;
    }
}

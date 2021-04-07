package figures;

public class Parallelepiped extends VolumePolygon{

    public Parallelepiped(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public String shapeName() {
        return "Parallelepiped";
    }
}

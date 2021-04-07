package figures;

abstract class VolumePolygon implements HasVolume, HasArea{
    private double sideA;
    private double sideB;
    private double sideC;

    public VolumePolygon(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public double area(){
        return 2*((sideA*sideB) + (sideB*sideC) + (sideA*sideC));
    }

    @Override
    public double volume(){
        return sideA*sideB*sideC;
    }
}

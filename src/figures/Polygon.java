package figures;

abstract class Polygon implements HasArea, HasPerimeter{
    private double sideA;
    private double sideB;

    public Polygon(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double area(){
        return sideA*sideB;
    }

    @Override
    public double perimeter(){
        return (sideA*2) + (sideB*2);
    }


}

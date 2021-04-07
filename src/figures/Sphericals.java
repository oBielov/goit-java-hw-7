package figures;
import java.lang.Math;

abstract class Sphericals implements HasRadius, HasVolume, HasArea, Shape {

    private double radius;

    public Sphericals(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double diameter() {
        return radius*2;
    }

    @Override
    public double area() {
        return 4 * (Math.PI * (Math.pow(radius, 2)));
    }

    @Override
    public double volume() {
        return 1.33 * (Math.PI * (Math.pow(radius, 3)));
    }
}

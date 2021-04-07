package figures;
import java.lang.Math;

abstract class ClosedCurves implements HasRadius, HasArea{
    private double radius;

    public ClosedCurves (double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double diameter(){
        return radius*2;
    }

    @Override
    public double area(){
        return (Math.PI*(radius*radius));
    }

    public double perimeter(){
        return radius*(Math.PI*2);
    }
}

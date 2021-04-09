package figures;

public class NamePrinter {

    /**
    * Gets any Shape instance/instances and prints its name
    * */

    public void name (Shape ... shapes){
        for (Shape shape : shapes){
            System.out.println(shape.shapeName());
        }
    }

}

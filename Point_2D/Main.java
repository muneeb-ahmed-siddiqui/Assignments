package Point_2D;

public class Main {
    public static void main(String[]args){
        Point_3D Dimension_3D = new Point_3D();
        Dimension_3D.set_3D(10,12,15);
        
        Pen piano=new Pen();
        piano.setcoordinates3D (
            Dimension_3D.get_x(),
            Dimension_3D.get_y(),
            Dimension_3D.get_z());
        piano.setInfo("Silk","Ball-point","Blue");
        // piano.show();
        System.out.println(piano);
        
    }
}

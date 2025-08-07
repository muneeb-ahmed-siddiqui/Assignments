public class MainPoint {
      public static void main(String[] args) {
        // object for null constructor 
        Point pointA = new Point();
        System.out.println("Point A :");
        pointA.show();
        pointA.setX(2);
        pointA.setY(15);
        pointA.show();
        //object for parametrize constructor 
        Point pointB = new Point(5,12);
        System.out.println("Point B :");
        pointB.show();
        pointB.setX(15);
        pointB.setY(17);
        pointB.show();
        //object for deep copy
        Point pointC = new Point(pointB);
        System.out.println("Point C :");
        pointC.show();
        //object for shallow copy or reference copy
        Point pointD=pointB;
        System.out.println("Point D :");
        pointD.show();
        //To check shallow and deep copy difference
        pointB.setX(111);
        System.out.println("Point B");
        pointB.show();
        System.out.println("Point C");
        pointC.show();
        System.out.println("Point D");
        pointD.show();
    }
}


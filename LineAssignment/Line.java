package LineAssignment;
class Line{
 private Point initialPoint,finalPoint;
  public void set_initialPoint(Point p){
      this.initialPoint=p;
  }
  public Point get_initialPoint(){
      return this.initialPoint;
  }
   public void set_finalPoint(Point p){
      this.finalPoint=p;
  }
  public Point get_finalPoint(){
      return this.finalPoint;
  }
  Line(Point initialPoint, Point finalPoint){
      this.initialPoint=initialPoint;
      this.finalPoint=finalPoint;
  }
  public double getLength(){
      double fx=finalPoint.getX()-initialPoint.getX();
      double fy=finalPoint.getY()-initialPoint.getY();
      return Math.sqrt(fx * fx + fy * fy);
  }
  public String toString(){
      return "Line[Initial point :"+initialPoint+",Final point:"+finalPoint+",Length of line : "+getLength()+"]";
  }
  
}


class Point{
     private double x,y;
     public void setX(double x){
         this.x=x;
     }
     public void setY(double y){
         this.y=y;
     }
     public double getX(){
        return this.x;
     }
     public double getY(){
        return this.y;
     }
     Point(double x , double y){
         this.x=x;
         this.y=y;
     }
    public String toString(){ 
   return "Point ["+x+", "+y+"]";
}
}
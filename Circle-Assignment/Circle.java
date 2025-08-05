class Point{
    private float x,y;
    public void setX(float x){
        this.x=x;
    }
    public void setY(float y){
        this.y=y;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    Point(){
    }
    Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "Point ["+x+","+y+"]";
    }
}
class Circle{
    private Point centre,circumference;
    public void setCentre(Point p){
        this.centre=p;
    }
    public void setCircumference(Point p){
        this.circumference=p;
    }
     public Point getCentre(){
        return this.centre;
    }
    public Point getCircumference(){
        return this.circumference;
    }
    Circle(Point centre, Point circumference){
        this.centre=centre;
        this.circumference=circumference;
    }
    public float radius(){
        float dx=circumference.getX() - centre.getX();
        float dy=circumference.getY() - centre.getY();
       float r=(float) Math.sqrt(dx*dx + dy*dy);
       return r;
    }
    public float area(){
        float r= radius();
        float a=(float)( 3.142 * (r * r) );
        return a;
    }
    public String toString(){
        float r = radius();
        float a = area();
        return "Circle[centre="+centre+",edge="+circumference+",radius of circle="+r+",area of circle="+a+"]";
    }
}


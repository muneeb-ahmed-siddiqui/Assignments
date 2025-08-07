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
    // default or null constructor
 Point(){
     this.x=1;
     this.y=1;
 }
 // parametrize constructor
 Point(float x , float y){
     this.x=x;
     this.y=y;
 }
 // copy constructor for deep copy
 Point(Point other){
     this.x=other.x;
     this.y=other.y;
 }
    public void show(){
        System.out.println("VALUE OF X : " +this.x);
        System.out.println("VALUE OF Y : " +this.y);
    }
}
  
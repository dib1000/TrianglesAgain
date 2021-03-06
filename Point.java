public class Point{
  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p){
    x= p.x;  //private access in the same file is allowed!
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }
  public double distanceTo(Point other) {
    double xdif = x - other.x;
    double ydif = y - other.y;
    return Math.sqrt((xdif*xdif)+(ydif*ydif));
  }
  public boolean equals(Point other) {
    return x == other.x && y == other.y;
  }
}

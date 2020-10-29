public class Triangle {
  private Point v1, v2, v3;
  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
    v1 = new Point(x1,y1);
    v2 = new Point(x2,y2);
    v3 = new Point(x3,y3);
  }
  public double getPerimeter() {
    double sideOne = v1.distanceTo(v2);
    double sideTwo = v2.distanceTo(v3);
    double sideThree = v3.distanceTo(v1);
    return sideOne + sideTwo + sideThree;
  }
  public double getArea() {
    double sideOne = v1.distanceTo(v2);
    double sideTwo = v2.distanceTo(v3);
    double sideThree = v3.distanceTo(v1);
    double s = getPerimeter()/2;
    return Math.sqrt(s*(s-sideOne)*(s-sideTwo)*(s-sideThree));
  }
  public String classify() {
    double sideOne = Math.round(v1.distanceTo(v2)*10000.0)/10000.0;
    double sideTwo = Math.round(v2.distanceTo(v3)*10000.0)/10000.0;
    double sideThree = Math.round(v3.distanceTo(v1)*10000.0)/10000.0;
    if(sideOne==sideTwo && sideTwo==sideThree) {
      return "equilateral";
    }
    else if (sideOne==sideTwo || sideTwo==sideThree || sideOne==sideThree) {
      return "isosceles";
    }
    return "scalene";
  }
  public String toString() {
    return "v1("+v1.getX()+", "+v1.getY()+") v2("+v2.getX()+", "+v2.getY()+") v3("+v3.getX()+", "+v3.getY()+")";
  }
  public void setVertex(int index, Point newP) {
    if(index == 0) {
      v1 = newP;
    }
    if(index == 1) {
      v2 = newP;
    }
    if(index == 2) {
      v3 = newP;
    }
  }
}

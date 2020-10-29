public class Tester {
  public static void main(String[] args) {
    Point p1 = new Point(0.0,2.0);
    Point p2 = new Point(2.0,0.0);
    Point p3 = new Point(0.0,2.0);
    Point p4 = new Point(2.0,2.0);
    System.out.println(p2.distanceTo(p1));
    System.out.println(p2.equals(p1));
    System.out.println(p1.equals(p3));

    System.out.println();
    Triangle t1 = new Triangle(p1,p2,p4);
    Triangle t2 = new Triangle(0.0,2.0,2.0,0.0,2.0,2.0);
    System.out.println(t1.toString());
    System.out.println(t2.toString());

    System.out.println();
    Triangle tSca = new Triangle(-0.1,1.38,1.04,0.16,-1.0,-0.5);
    Triangle tEquil = new Triangle(0.1,0.1,-1.9,0.1,-0.9,-1.632051);
    Triangle tIsos = new Triangle(6.66667,5.048,3.6667,5.04799,3.6669,2.04799);
    System.out.println(tSca.getPerimeter());
    System.out.println(tIsos.getPerimeter());
    System.out.println(tEquil.getPerimeter());
  }
}

public class Tester {
  public static void main(String[] args) {
    Point p1 = new Point(0.0,2.0);
    Point p2 = new Point(2.0,0.0);
    Point p3 = new Point(0.0,2.0);
    System.out.println(p2.distanceTo(p1));
    System.out.println(p2.equals(p1));
    System.out.println(p1.equals(p3));
  }
}

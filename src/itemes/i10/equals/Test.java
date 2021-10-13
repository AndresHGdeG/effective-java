package itemes.i10.equals;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(2,4);
        Point p2 = new Point(2, 4);
        Point p3 = new Point(3,5);
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.equals(p3): " + p1.equals(p3));
    }
}

package itemes.i10.equals;

public class Test {
    public static void main(String[] args) {
        //testColor();
        brokeSimetry();
    }

    public static void brokeSimetry(){
        ColorPoint cp1 = new ColorPoint(1,2,Color.GREEN);
        Point p1 = new Point(1,2);
        System.out.println("cp1.equals(p1): " + cp1.equals(p1));
        System.out.println("p1.equals(cp1): " + p1.equals(cp1));
    }
    public static void testColor(){
        Point p1 = new Point(2,4);
        Point p2 = new Point(2, 4);
        Point p3 = new Point(3,5);
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.equals(p3): " + p1.equals(p3));
    }
}

package itemes.i10.equals;

public class ColorPoint extends Point {
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof ColorPoint)){
            return false;
        }
        ColorPoint cp = (ColorPoint) o;
        return super.equals(cp) && cp.color.equals(color);
    }
}

package abstractClass;

public class Circle extends Shape {

    private int radius;

    Circle(){

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    protected void findArea() {
        area = 3.14F * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString()+ "\tCircle{" +
                "radius=" + radius +
                '}';
    }
}

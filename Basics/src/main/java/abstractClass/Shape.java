package abstractClass;

public abstract class Shape {
    protected float area;

    protected abstract void findArea();

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                '}';
    }
}
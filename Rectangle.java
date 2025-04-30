
public class Rectangle implements Shape {
    private final double price = 10.0;

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }

    @Override
    public double getCost() {
        return price;
    }
}
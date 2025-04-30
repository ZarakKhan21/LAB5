public class Circle implements Shape {
    private final double price = 8.0;

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }

    @Override
    public double getCost() {
        return price;
    }
}
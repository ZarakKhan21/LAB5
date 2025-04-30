
public class RedShapeDecorator extends ShapeDecorator {
    private final double decorationCost = 2.5;

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder();
        System.out.println("Total Cost: $" + getCost());
    }

    private void setRedBorder() {
        System.out.println("Border Color: Red (+$" + decorationCost + ")");
    }

    @Override
    public double getCost() {
        return super.getCost() + decorationCost;
    }
}

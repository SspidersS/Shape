public abstract class Shape {
    protected abstract String getName();

    public void printName() {
        System.out.println("Shape: " + getName());
    }
}
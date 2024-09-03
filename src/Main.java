public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Shape circle = new Circle();
        Shape square = new Square();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape ellipse = new Ellipse();

        printer.printShapeName(circle);
        printer.printShapeName(square);
        printer.printShapeName(rectangle);
        printer.printShapeName(triangle);
        printer.printShapeName(ellipse);
    }
}
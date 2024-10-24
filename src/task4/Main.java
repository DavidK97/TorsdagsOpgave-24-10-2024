package task4;

public class Main {
    public static void main(String[] args) {

        //Vi instatierer nye Circle og Square objekter
        Shape circle1 = new Circle(10);
        Shape square1 = new Square(10);

        //Vi tester at getArea() virker
        System.out.println(circle1.getArea());
        System.out.println(square1.getArea());

        //Vi instantierer et nyt ShapeBuilder objekt og tilføjer Shape objekter til det
        ShapeBuilder shapeBuilder1 = new ShapeBuilder();
        shapeBuilder1.addShape(circle1);
        shapeBuilder1.addShape(square1);

        //Vi kalder getTotalArea-metoden og gemmer den i en ny variabel før den printes ud
        double totalArea = shapeBuilder1.getTotalArea();
        System.out.println(totalArea);
    }
}

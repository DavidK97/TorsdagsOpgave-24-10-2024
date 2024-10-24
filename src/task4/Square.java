package task4;

public class Square implements Shape {
    private double length;

    public Square (double length){
        this.length = length;
    }

    public double getArea(){
        return length * length;
    }
}

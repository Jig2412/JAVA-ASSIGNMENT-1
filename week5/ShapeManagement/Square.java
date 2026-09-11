
public class Square extends Shape {
    private double side;
    Square(double side,String colour){
        super(colour);
        if(side>=0){
            this.side=side;

        }
        else{
            this.side=0;
        }
    }
     @Override
    public double area() {
    return (side*side);
}
 @Override
    public double perimeter() {
    return (4*side);
}
public String toString() {
        return "Square: side=" + side + ", color=" + colour;
    }
}

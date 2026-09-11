
public class Rectangle extends Shape{
    private double length;
    private double breadth;

    Rectangle(double length,double breadth,String colour){
        super(colour);
        if(length>=0 && breadth>=0){
            this.length=length;
            this.breadth=breadth;
        }
        else{
            this.length=0;
            this.breadth=0;
        }

    }
     @Override
    public double area() {
        return length*breadth;
     }

 @Override
    public double perimeter() {
    return 2*(length+breadth);
}
 public String toString() {
        return "Rectangle: length=" + length + ", width=" + breadth + ", color=" + colour;
    }

}

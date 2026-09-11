

 public class Circle extends Shape {
    private double radius;
    Circle(double radius , String colour){
        super(colour);
        if(radius>=0){
            this.radius=radius;
        }
        else{
            this.radius=0;
        }
    }
 @Override
public double area() {
    return Math.PI*radius*radius;
}
 @Override
public double perimeter(){
    return 2*Math.PI*radius;
}
public String toString() {
        return "Circle: radius=" + radius + ", color=" + colour;
    }

}

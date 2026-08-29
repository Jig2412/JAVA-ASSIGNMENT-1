public class RectangleModel {
    private double width;
    private double height;
    RectangleModel(){
       this(1);
       System.out.println("No-argument constructor");

    }
    RectangleModel(double side){
       this(side,side);
       System.out.println("One-argument constructor");
    }
    RectangleModel(double width,double length){
        if(length>0 && width>0){
        this.width = width;
        this.height = length;
        }
        System.out.println("Two-argument constructor");

    }
    public double getArea(double width,double height){
        return width*height;
    }
    public double getPerimeter(double width,double length){
        return 2*(width+length);
    }
    boolean isSquare(double side){
        if(width==height){
            return true;
        }
        return false;
    }
    public void scale(double factor){
        if (factor>0) {
            width = width * factor;
            height = height * factor;
        }
    }
    @Override
public String toString() {
    return "RectangleModel{width=" + width + ", height=" + height + "}";
}

}



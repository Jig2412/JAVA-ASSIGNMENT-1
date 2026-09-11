

abstract class Shape{
    protected String colour;


    Shape(String colour){
        this.colour=colour;
    }

    
   public abstract double area();
   public abstract double perimeter();
    @Override
    public String toString() {
        return "Colour: " + colour;
    }

}
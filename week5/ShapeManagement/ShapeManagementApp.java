
 public class ShapeManagementApp{
 public static void main(String[] args){
     Shape[] s = {
            new Circle(5.0, "Red"),
            new Rectangle(6.0, 7.0, "Blue"),
            new Square(4.0, "Yellow"),
            new Circle(3.0, "Green"),
            new Square(10.0, "Purple"),
            new Rectangle(9.0, 8.0, "Gold")
        };

        System.out.println("All Shapes:");

        for(int i=0;i<s.length;i++) {
            System.out.println(s[i]);
        }

        double TotalArea = 0;
        double Totalperimeter = 0;

        for(int i=0; i<s.length; i++) {
            TotalArea+=s[i].area();
            Totalperimeter+=s[i].perimeter();
        }

        System.out.println("Total Area: " + TotalArea);
        System.out.println("Total Perimeter: " + Totalperimeter);

        Shape largest = s[0];

        for(int i = 1; i < s.length; i++) {
            if(s[i].area() > largest.area()) {
                largest = s[i];
            }
        }

        System.out.println("Largest Shape: " + largest);
    }

}
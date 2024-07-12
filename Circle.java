// This is a class for Circle which is a subclass of Shape with instance variable radius
//public class Circle extends Shape {
    //private double radius;

//This is a constructor for Circle class with parameter name of type string and radius
    //public Circle(String name, double radius) {
        //super(name);
        //this.radius = radius;
    //}

//This computes and returns the perimeter of the circle
    //public double computePerimeter() {
        //return 2 * Math.PI * radius;
    //}

 //This computes and returns the area of the circle
    //public double computeArea() {
        //return Math.PI * radius * radius;
    //}
//}



//Here the Circle class extends Shape 
//provides implementation of scale method, computeArea and computePerimeter
//Overriding the scale method to adjust dimensions
 
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void scale(double factor) {
        this.radius *= factor;
    }

    @Override
    public String toString() {
        return super.toString() + " with radius " + radius;
    }
}






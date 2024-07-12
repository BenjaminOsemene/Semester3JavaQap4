//Class for Triangle and subclass of Shape with three protected instance variables 
//public class Triangle extends Shape {
    //protected double side1, side2, side3;

//This defines a constructor for Triangle with parameters name, side1, side2 and side3
    //public Triangle(String name, double side1, double side2, double side3) {
        //super(name);
        //if (isValidTriangle(side1, side2, side3)) {
            //this.side1 = side1;
            //this.side2 = side2;
            //this.side3 = side3;
        //} else {
            //System.out.println("Error: Invalid triangle sides");
            //System.exit(1);
        //}
    //}

//This checks if the given side lengths can form a valid triangle
//Then returns true if valid and false if not valid 
    //private boolean isValidTriangle(double a, double b, double c) {
       // return (a + b > c) && (b + c > a) && (c + a > b);
   // }

//This computes and returns the perimeter of the triangle
    //public double computePerimeter() {
        //return side1 + side2 + side3;
    //}

//Also computes and returns the area of the triangle using the formula
    //public double computeArea() {
        //double s = (side1 + side2 + side3) / 2;
        //return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    //}
//}


// This is a Triangle class and extends the Shape class
public class Triangle extends Shape {
    // Protected instance variables to store the lengths of the three sides
    protected double side1, side2, side3;

    // Constructor for the Triangle class
    public Triangle(double side1, double side2, double side3) {
        // Call the constructor of the parent class (Shape) with the name "Triangle"
        super("Triangle");
        // Initialize the side lengths
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Override the computeArea method from the Shape class
    @Override
    public double computeArea() {
        // Calculate the semi-perimeter
        double s = (side1 + side2 + side3) / 2;
        // Calculate the area of the triangle
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Override the computePerimeter method from the Shape class
    @Override
    public double computePerimeter() {
        // Calculate the perimeter by summing all sides
        return side1 + side2 + side3;
    }

    // Override the scale method from the Shape class
    @Override
    public void scale(double factor) {
        // Multiply each side length by the scaling factor
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }

    // Override the toString method to provide a string representation of the Triangle
    @Override
    public String toString() {
        // Call the super class's toString method and append the side lengths
        return super.toString() + " with sides " + side1 + ", " + side2 + ", " + side3;
    }
}



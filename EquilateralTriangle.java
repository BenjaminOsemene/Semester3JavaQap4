/*// This defines EquilateralTriangle class whuch is a subclass of Triangle
public class EquilateralTriangle extends Triangle {
    
//Constructor for EquilateralTriangle with two parameters name and side
//Passes the name, side parameter 3 times to the super class constructor
        public EquilateralTriangle(String name, double side) {
            super(name, side, side, side);
        }
      }*/


    
// This class represents an Equilateral Triangle and extends the Triangle class
public class EquilateralTriangle extends Triangle {
    
    // Constructor for the EquilateralTriangle class
    public EquilateralTriangle(double side) {
        // Call the constructor of the parent class (Triangle) with the same side length for all three sides
        super(side, side, side);
        // Override the name property inherited from the Shape class
        this.name = "Equilateral Triangle";
    }

    // Override the computeArea method from the Triangle class
    @Override
    public double computeArea() {
        // Use the formula for the area of an equilateral triangle
        return (Math.sqrt(3) / 4) * side1 * side1;
    }

    // Override the toString method to provide a string representation of the EquilateralTriangle
    @Override
    public String toString() {
        // Call the parent class's toString method and append "(Equilateral)" to indicate it's an equilateral triangle
        return super.toString() + " (Equilateral)";
    }
}

/* 
//This is  Abstract class for shape 
public abstract class Shape {
    protected String name;

//Constructor for Shape class with parameter name of type string
    public Shape(String name) {
        this.name = name;
    }

//Abstract method to compute the perimeter of the shape
    public abstract double computePerimeter();

//Abstract method to compute the area of the shape
    public abstract double computeArea();

//This overriding toString method to provide a string representation of the shape
//Then returns a string containing the shape's name, area, and perimeter
    @Override
    public String toString() {
        return String.format("Shape: %s, Area: %.2f, Perimeter: %.2f", 
                             name, computeArea(), computePerimeter());
    }
}*/


// This is an abstract class representing a generic Shape
// It implements the Scalable interface, indicating that all shapes can be scaled
public abstract class Shape implements Scalable {
    // Protected field to store the name of the shape
    protected String name;

    // Constructor for the Shape class
    // It takes a name parameter to initialize the shape's name
    public Shape(String name) {
        this.name = name;
    }

    // Abstract method to compute the area of the shape
    // This method must be implemented by all concrete subclasses
    public abstract double computeArea();

    // Abstract method to compute the perimeter of the shape
    // This method must be implemented by all concrete subclasses
    public abstract double computePerimeter();

    // Override the toString method to provide a string representation of the shape
    @Override
    public String toString() {
        return "Shape: " + name;
    }
}


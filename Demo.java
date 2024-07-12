// This is just a Demo class to test the Shape hierarchy
/*public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle("Circle", 5);
        shapes[1] = new Ellipse("Ellipse", 4, 3);
        shapes[2] = new Triangle("Triangle", 3, 4, 5);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);
        shapes[4] = new Ellipse("Another Ellipse", 6, 2);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}*/



public class Demo {
    
    // This method scales an array of Scalable objects and prints their states before and after scaling
    public static void scaleShapes(Scalable[] scalables, double factor) {
        // Print the state of each Scalable object before scaling
        System.out.println("Before scaling:");
        for (Scalable s : scalables) {
            System.out.println(s);
        }

        // Scale each Scalable object by the given factor
        for (Scalable s : scalables) {
            s.scale(factor);
        }

        // Print the state of each Scalable object after scaling
        System.out.println("\nAfter scaling by factor " + factor + ":");
        for (Scalable s : scalables) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        // Create an array of Scalable objects
        Scalable[] shapes = new Scalable[4];
        // Initialize the array with different shapes
        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(10, 5);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(6);

        // Call the scaleShapes method to scale all shapes by a factor of 2
        scaleShapes(shapes, 2);

        // Print the areas and perimeters of the scaled shapes
        System.out.println("\nAreas and Perimeters after scaling:");
        for (Scalable s : shapes) {
            // Check if the Scalable object is also an instance of Shape
            if (s instanceof Shape) {
                // Cast the Scalable object to Shape
                Shape shape = (Shape) s;
                // Print the shape's string representation
                System.out.println(shape);
                // Print the shape's area
                System.out.println("Area: " + shape.computeArea());
                // Print the shape's perimeter
                System.out.println("Perimeter: " + shape.computePerimeter());
                System.out.println();
            }
        }
    }
}
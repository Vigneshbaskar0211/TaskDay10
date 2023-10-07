package Thirdprogram;


public class Circle {
		    public double radius;

		    // Constructor with no arguments, initializes radius to 0.0
		    public Circle() {
		        this.radius = 0.0;
		    }

		    // Constructor with two arguments to set the radius
		    public Circle(double radius) {
		        this.radius = radius;
		    }

		    // Method to calculate the circumference
		    public double calculateCircumference() {
		        return 2 * Math.PI * radius;
		    }

		    public static void main(String[] args) {
		        // Creating instances of Circle with different constructors
		        Circle circle1 = new Circle();          // Using the no-argument constructor
		        Circle circle2 = new Circle(5.0);      // Using the constructor with an initial radius of 5.0

		        // Calculating and printing circumferences
		        System.out.println("Circumference of circle1: " + circle1.calculateCircumference());
		        System.out.println("Circumference of circle2: " + circle2.calculateCircumference());
		    }
		}


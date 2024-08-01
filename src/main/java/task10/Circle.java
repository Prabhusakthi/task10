package task10;

	public class Circle {
	    // Attribute
	    private double radius;

	    // No-argument constructor
	    public Circle() {
	        this.radius = 1.0; // default radius
	    }

	    // Constructor with radius argument
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Getter for radius
	    public double getRadius() {
	        return radius;
	    }

	    // Setter for radius
	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    // Method to calculate circumference
	    public double getCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    public static void main(String[] args) {
	        // Creating a Circle instance using no-argument constructor
	        Circle circle1 = new Circle();
	        System.out.println("Circle 1 radius: " + circle1.getRadius());
	        System.out.println("Circle 1 circumference: " + circle1.getCircumference());

	        // Creating a Circle instance using constructor with radius argument
	        Circle circle2 = new Circle(5.0);
	        System.out.println("Circle 2 radius: " + circle2.getRadius());
	        System.out.println("Circle 2 circumference: " + circle2.getCircumference());

	        // Setting a new radius for circle1 and calculating new circumference
	        circle1.setRadius(3.0);
	        System.out.println("Circle 1 new radius: " + circle1.getRadius());
	        System.out.println("Circle 1 new circumference: " + circle1.getCircumference());
	    }
	}




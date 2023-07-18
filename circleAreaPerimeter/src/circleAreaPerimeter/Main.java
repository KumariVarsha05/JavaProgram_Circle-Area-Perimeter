package circleAreaPerimeter;

public class Main {

	public static void main(String[] args) {
		
		double r = 5.0;
		
	    Circle c = new Circle(r);
	    
	    System.out.println("Perimeter: " + c.getPerimeter());
	    System.out.println("Area: " + c.getArea());

	}

}

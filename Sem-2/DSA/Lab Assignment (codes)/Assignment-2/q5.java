
public class q5 {

	class PointType {
	    private double x; 
	    private double y;

	    public PointType() {
	        this.x = 0;
	        this.y = 0;
	    }

	    public void setCoordinates(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }

	    public void printCoordinates() {
	        System.out.println("Point coordinates: (" + x + ", " + y + ")");
	    }

	    public double getX() {
	        return x;
	    }

	    public double getY() {
	        return y;
	    }
	}

	class CircleType extends PointType {
	    private double radius; 
	    public CircleType() {
	        super(); 
	        this.radius = 0;
	    }

	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    public void printRadius() {
	        System.out.println("Circle radius: " + radius);
	    }


	    public void printArea() {
	        double area = Math.PI * radius * radius;
	        System.out.println("Circle area: " + area);
	    }

	    public void printCircumference() {
	        double circumference = 2 * Math.PI * radius;
	        System.out.println("Circle circumference: " + circumference);
	    }
	}


}

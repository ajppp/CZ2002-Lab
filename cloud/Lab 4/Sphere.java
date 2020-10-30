public class Sphere implements Shape{
    private int radius;
	
	public Sphere (int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius*4;
    }   
    
}

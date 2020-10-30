public class Cylinder implements Shape{
  private int radius;
  private int height;
	
	public Cylinder(int radius, int height) {
    this.radius = radius;
    this.height = height;
	}

	public int getRadius() {
		return radius;
  }
  
  public int getHeight() {
		return height;
	}
	
	public double getArea() {
		return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }   
    
    
}

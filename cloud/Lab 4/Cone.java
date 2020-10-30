public class Cone implements Shape{
  private int radius;
  private int height;
  
	public Cone (int radius, int height) {
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
		return Math.PI*radius*(radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
  }   
    
}

public class Rectangle implements Shape{
    private int length;
    private int breadth;
    
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
	}
	
	public int getLength() {
		return length;
    }
    
    public int getBreadth() {
		return breadth;
	}
	
	
	public double getArea() {
		return length*breadth;
	}
    
}

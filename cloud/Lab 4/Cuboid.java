public class Cuboid implements Shape {
    private int length;
    private int breadth;
    
    public Cuboid(int length, int breadth) {
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
		return (4*breadth*length) + (2*breadth*breadth);
	}
    
}
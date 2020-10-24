public class Cuboid extends Rectangle{
    
    public Cuboid(int length, int width) {
        super(length,width);
    }
    
    public double surfaceArea() {
		return (4*super.getArea()) + (2*Math.pow(super.getBreadth(),2));
	}
}

public class Sphere extends Circle {
    
    public Sphere(int radius) {
		super(radius);
	}
    
    public double surfaceArea(){
        double area = super.getArea();
        return area*4;
    }
    
}

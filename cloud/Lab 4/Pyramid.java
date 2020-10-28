public class Pyramid extends Triangle{
    public Pyramid(int height, int base) {
		super(height, base);
    }
    
    public double surfaceArea() {
        // I included the base area for the pyramid 
        double baseArea = Math.pow(super.getBase(), 2);
        return baseArea + 4*super.getArea();  
	}
    
}

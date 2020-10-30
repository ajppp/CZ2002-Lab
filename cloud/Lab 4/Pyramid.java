public class Pyramid implements Shape {
    private int height;
    private int base;

    public Pyramid (int height, int base) {
      this.height = height;
      this.base = base;
    }

    public int getHeight() {
      return height;
    }

    public int getBase() {
     return base;
    }
    public double getArea() {
        // I included the base area for the pyramid 
        double baseArea = Math.pow(base, 2);
        return baseArea + base*Math.sqrt(4*height*height + base*base);  
	}
    
}

import java.lang.Math;

public class Cone implements Shape{
   private double base;
   private double height;

   public Cone(double base, double height){
       this.base = base;
       this.height = height;
   }

   public double findArea(){
       double side = Math.sqrt(base * base + height * height);
       return Math.PI * base * side + new Circle(base/1).findArea();
   }
}


package abstractionProb;

public class AbsProTest {
   
    public static void main(String[] args) {
        
        Shape shape;
        
        shape = new Rectangle(10,5);
        shape.area();
        
        shape = new Circle(3);
        shape.area();
        
        shape = new Triangle(10, 5);
        shape.area();
    }
}

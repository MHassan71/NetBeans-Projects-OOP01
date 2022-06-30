
package polymorphismShape;

public class PolyShapeTest {
    public static void main(String[] args) {
        
        Shape [] s = new Shape[3];
        
        s[0] = new Shape();
        s[1] = new Rectangle(20,10);
        s[2] = new Triangle(20,10);
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println(s[i].area()); 
        }
        
         
        
    }
}

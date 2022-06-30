
package methodOverload;

public class OverloadTest {
    public static void main(String[] args) {
        
        MethodOverload ob = new MethodOverload();
        
        ob.add(10, 15);
        ob.add(10.5, 13.5);
        ob.add(10, 15, 20);
        ob.add();
    }
}

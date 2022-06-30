
package abstraction;

public class AbstractTest {
    
    public static void main(String[] args) {
        
        MobileUser mu;
        
        mu = new Rahim();
        mu.sendMessage();
        mu.call();
        
        mu = new Karim();
        mu.sendMessage();
    }
}

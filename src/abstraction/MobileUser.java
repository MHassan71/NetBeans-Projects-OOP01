
package abstraction;

public abstract class MobileUser {
    
    void call(){
        System.out.println("non-Abstract Method");
    }
    
    abstract void sendMessage();
}

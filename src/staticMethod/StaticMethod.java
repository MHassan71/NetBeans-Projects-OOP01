
package staticMethod;

public class StaticMethod {
    static int x =10;
     
    void display1(){
         
        System.out.println("Value of x: " +x);
        System.out.println("I am non Static Method");
        
    }
    
    static void display2(){
       
        
        System.out.println("Value of x: " +x);
        System.out.println("I am Static Method");
    }
    
}

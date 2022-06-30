
package superClass;

public class B extends A{
    
    @Override
    void display(){
   
       //super.display();
        System.out.println("Inside Class B");
        super.display();
        message();
    }
}

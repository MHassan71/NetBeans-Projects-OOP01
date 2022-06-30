
package inheritance;

public class Teacher extends Person {
    
    //String qualification;
    
    void displayinformation2(){
        
        System.out.println("Teacher1");
        displayInformation1("Alex", 32, "Diploma in Nursing");
        
        System.out.println("================");
        System.out.println("Teacher2");
        displayInformation1("Heather", 27, "Bachelor is Physics");
        
    }
}

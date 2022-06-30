
package constructor;

public class ConstructTest {
    
    public static void main(String[] args) {
        
        ConstructTeacher teacher1 = new ConstructTeacher("Sarwar", "Male", 123465);
        teacher1.displayInformation();
        
        ConstructTeacher teacher2 = new ConstructTeacher("Sarah", "Female", 3478954);
        teacher2.displayInformation();
        
        ConstructTeacher teacher3 = new ConstructTeacher("Mark", 9175846);
        teacher3.displayInformation();
        
    }
}

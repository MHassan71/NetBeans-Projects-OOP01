
package methodOverRide;

public class OverRideTest {
    
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.name = "Mahmudul Hassan";
        t1.age = 42;
        t1.qualification = "BSc in CSc";
        t1.address = "5875 Ludlow Ave";
        t1.displayInformation();
        
        System.out.println("==========\n");
        Person p1 = new Person();
        p1.name = "Marullah";
        p1.age = 45;
        p1.displayInformation();
        
        System.out.println("==========\n");
        p1 = new Teacher();
        
        p1.name = "Mark";
        p1.address = "2340 Main Street";
        p1.displayInformation();
    }
}

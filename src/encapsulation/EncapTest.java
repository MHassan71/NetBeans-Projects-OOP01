
package encapsulation;

public class EncapTest {
    
    public static void main(String[] args) {
        
        Person p1 = new Person();
        p1.setName("Sarwar");
        p1.setAge(34);
        System.out.println("Name: " +p1.getName());
        System.out.println("Age: " + p1.getAge());
        
        //p1.age = 34;
       
        
    }
}

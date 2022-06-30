
package inheritance;

public class Person {
    
    String name;
    int age;
    String qualification;
    
    void displayInformation1(String name, int age, String qualification){
        this.name = name;
        this.age = age;
        this.qualification = qualification;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Qualification: " + qualification);
    }
}

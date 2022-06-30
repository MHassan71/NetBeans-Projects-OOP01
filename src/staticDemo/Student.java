
package staticDemo;

public class Student {
    
    String name;
    int id;
    static String UniversityName = "CCNY";
    
    Student(String name, int id){
        
        this.name = name;
        this.id = id;
    }
    
    void displayInformation(){
        System.out.println("Studen Name: " + name);
        System.out.println("Studen ID: " + id);
        System.out.println("University Name: " + UniversityName);
        
        System.out.println("\t");
        
        System.out.println("===================");
    }
    
    
}

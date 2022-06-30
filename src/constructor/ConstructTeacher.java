
package constructor;

public class ConstructTeacher {
    
    String name; 
    String gender;
    int phone;
    
    ConstructTeacher(String n, String g, int p){
        
        name = n;
        gender = g;
        phone = p;
        
    }
    
    ConstructTeacher(String n, int p){
        name = n;
        phone = p;
        
    }
    
    void displayInformation(){
        
        System.out.println("Name is: "+ name);
        System.out.println("Gender is: "+ gender);
        System.out.println("Phone number is: "+ phone);
        
        System.out.println("\t");
    }
    
}

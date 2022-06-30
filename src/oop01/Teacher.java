
package oop01;

public class Teacher{
   
    String name, gender;
    int phone;
    
    void setInformation(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;
    }
    
    void dispalyInformation(){
    
      System.out.println("Name is: " + name);
      System.out.println("Gender is: " + gender);
      System.out.println("Phone number is: " + phone);  
      System.out.println("\t");
}
    
    
}

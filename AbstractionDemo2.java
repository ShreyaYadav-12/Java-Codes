package oops;

abstract class student{
    String name; int roll;
    
    student(String name, int roll)
    {
        this.name=name;
        this.roll=roll;
    }
    
    abstract void attends();
    abstract void exam();
    
    void register()
    {
        System.out.println(name+"(Roll no: "+roll+") is registered");
    }
}

class SchoolStudent extends student{
    
    SchoolStudent(String name, int roll)
    {
        super(name, roll);
    }
    void attends()
    {
        System.out.println(name + " attends school in a physical classroom.");
    }
    
    void exam()
    {
        System.out.println(name + " takes exam in school.");
    }
}

class CollegeStudent extends student{
    
    CollegeStudent(String name,int roll)
    {
        super(name,roll);
    }
    void attends()
    {
        System.out.println(name + " attends college.");
    }
    
    void exam()
    {
     System.out.println(name+ " takes exam on online portal.");
    }
}

public class AbstractionDemo2 {
    public static void main(String[] args) {
        student s1=new SchoolStudent("Rahul", 111);
        student s2=new CollegeStudent("Anita", 222);
        
        s1.register(); 
        s1.attends();
        s1.exam();
        
        s2.register(); 
        s2.attends();
        s2.exam();
        
    }
}
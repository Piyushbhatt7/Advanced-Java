
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class student implements Serializable 
{
    String name;
    int age;
    
    public student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void display()
    {
        System.out.println("Name: " + name + "Age: " + age);
    }
}

public class SerializableEX {
    
    String filename = "my.txt";

    try(ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(filename)))
    {
        student s1 = new student("Piyush", 20);
    }
    
    

}

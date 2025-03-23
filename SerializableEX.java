
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
    
}

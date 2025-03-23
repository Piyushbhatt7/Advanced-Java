
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
}

public class SerializableEX {
    
}

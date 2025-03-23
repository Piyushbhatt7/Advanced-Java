
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
// Removed static import to avoid conflict with variable name


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

    public static void main(String[] args) throws IOException {
        
    
    
    String filename = "my.ser";

    try(ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(filename)))
    {
        student s1 = new student("Piyush", 20);
        ob.writeObject(s1);
        System.out.println("Serilization done");
    }

    catch(IOException e)
    {
        System.out.println(e);
    }

    // deserilization

    try(ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(filename)))
    {
        student s2 = (student) objIn.readObject();
        System.out.println("Deserilization done");
        s2.display();
        
    }

    catch(IOException | ClassNotFoundException e)
    {
        System.out.println(e);
    }
    
}

}


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.stream.Stream;

class Student implements Serializable {

    String name;
    int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void display()
    {
        System.out.println("Name: "+ name + "Age: " + age);
    }
}

public class Serilization {
    
    public static void main(String[] args) {
        
        String filename = "student.ser";
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOOutput))
        {
            Stream((filename));

            Student s1 = new Student("John", 10);
            out.writeObject(s1);
            System.out.println("Serialization done..");
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

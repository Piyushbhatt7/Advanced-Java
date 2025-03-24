
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            

            Student s1 = new Student("John", 20);
            out.writeObject(s1);
            System.out.println("Serialization done..");
        } 
     
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        // Deserializaion

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename)))
        {
            Student s2 = (Student) in.readObject();
            System.out.println("Deserialization done..");
            s2.display();
        }

        catch(IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void display()
    {
        System.out.println("Nmae = " + name + " Age = " + age);
    }
    
}

public class SerDe {
    
    public static void main(String[] args) throws IOException {
        
        String filename = "Seril.ser";

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            Student obj = new Student("Piyush", 10000000);
            out.writeObject(obj);
            System.out.println("Serilization done...");
        }
    }

}

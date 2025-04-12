
import java.io.Serializable;

public class Serilized implements Serializable{
    
        String name;
        int age;

        public Student(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public void display()
        {
            System.out.println("Name: " + name + " Age:");
        }
    
}


import java.io.Serializable;

public class MyClass implements Serializable{
    
        String name;
        int age;

        public Serilized(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public void display()
        {
            System.out.println("Name: " + name + " Age: " + age);
        }
    
}

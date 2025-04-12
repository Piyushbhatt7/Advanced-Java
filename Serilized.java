
import java.io.Serializable;

public class MyClass implements Serializable{
    
        String name;
        int age;

        public MyClass(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public void display()
        {
            System.out.println("Name: " + name + " Age: " + age);
        }
    
}

public class Serilized {

    public static void main(String[] args) {
        
    }
}

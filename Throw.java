public class Throw {
    
    public static void main(String[] args) {
        
        int a =10, b = 0;
       int c = a / b;
        System.out.println(c);
        throw new ArithmeticException("Can't divide by 0");
    }
}

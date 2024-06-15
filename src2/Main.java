import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Person person = new Person("Petya", random.nextInt(25));
        System.out.println(person);
    }
}
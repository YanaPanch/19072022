package Task3;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person2.input("John", "Johnson", 1990);
        Person person3 = new Person("Mike", "Johnson");
        Person person4 = new Person();
        person4.input("Max", "Mad", 1985);
        Person person5 = new Person("Oliver", "Johnson");

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }
}

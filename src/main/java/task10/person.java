package task10;

public class person {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Creating an instance of Person
        person person = new person("John Doe", 30);

        // Using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Create two instances of the Person class
        Person person1 = new Person("Aman", 19);
        Person person2 = new Person("Ayushi", 20);

        // Print the name and age of the first person
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());

        // Print the name and age of the second person
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}

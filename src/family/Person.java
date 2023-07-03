package family;

public class Person {
    String name;
    String motherName;
    String fatherName;

    public Person(String name, String motherName, String fatherName) {
        this.name = name;
        this.motherName = motherName;
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }
}

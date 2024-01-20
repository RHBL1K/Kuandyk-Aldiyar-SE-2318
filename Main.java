import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Employee Aldiyar = new Employee("Aldiyar", "Kuandyk", "Manager", 37445.78);
        Employee Nursultan = new Employee("Nursultan", "Zhumagali", "Designer", 53250.00);
        Student Vladimir = new Student("Vladimir", "Efimov", 2.1);
        Student Ernur = new Student("Ernur", "Kazhyakpar", 3.3);
        people.add(Aldiyar);
        people.add(Nursultan);
        people.add(Vladimir);
        people.add(Ernur);


        Collections.sort(people);
        printData(people);

    }

    public static void printData(Iterable<Person>people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
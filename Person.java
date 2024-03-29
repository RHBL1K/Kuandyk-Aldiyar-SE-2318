
public class Person implements Payable, Comparable<Person> {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String surname;

    public Person() {
        this.id = idCounter++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getPaymentamount() {
        return 0.0; // Default implementation for Person
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentamount(), other.getPaymentamount());
    }

    @Override
    public String toString() {
        return getPosition() + ": " + getId() + ". " + getName() + " " + getSurname();
    }
}
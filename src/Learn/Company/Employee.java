package accessingattributesexercise;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    private Address address;

    public Employee(String firstName, String lastName, double salary, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //1. scrie o metoda care afiseaza numele angajatului

    //2. scrie o metoda care afiseaza strada adresei angajatului

    //3. scrie o metoda care afiseaza toate atributele adresei angajatului
}

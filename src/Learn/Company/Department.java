package accessingattributesexercise;

public class Department {

    private String departmentName;

    private Employee[] employees;

    private int numberOfEmployeesInDepartment;

    public Department(String departmentName, Employee[] employees, int numberOfEmployeesInDepartment) {
        this.departmentName = departmentName;
        this.employees = employees;
        this.numberOfEmployeesInDepartment = numberOfEmployeesInDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getNumberOfEmployeesInDepartment() {
        return numberOfEmployeesInDepartment;
    }

    public void setNumberOfEmployeesInDepartment(int numberOfEmployeesInDepartment) {
        this.numberOfEmployeesInDepartment = numberOfEmployeesInDepartment;
    }

    //4. scrie un program care afiseaza numarul de angajati din departament

    //5. scrie o metoda care printeaza toti angajatii din departament

    //6. scrie o metoda care printeaza toate strazile adreselor angajatilor din departament

    //7. scrie o metoda care cauta un anumit angajat dupa nume in departament, si ii afiseaza numele daca il gaseste

    //8. scrie o metoda care printeaza adresa unui anumit angajat din departament

    //9. scrie o metoda care cauta o adresa (dupa strada) in lista de angajati a departamentului, si ii afiseaza strada daca o gaseste
}

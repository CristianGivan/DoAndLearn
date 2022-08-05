package accessingattributesexercise;

public class Company {

    private String name;
    private int yearFounded;
    private Department[] departments;

    private int numberOfDepartments;

    public Company(String name, int yearFounded, Department[] departments, int numberOfDepartments) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.departments = departments;
        this.numberOfDepartments = numberOfDepartments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    //10. scrie o metoda care printeaza toate departamentele din companie

    //11. scrie o metoda care printeaza toti angajatii dintr-un anumit departament din companie

    //12. scrie o metoda care printeaza cati angajati are un anumit departament din companie

    //13. scrie o metoda care cauta dupa nume un anumit departament si il returneaza daca il gaseste

    //14. scrie o metoda care printeaza toate strazile adreselor angajatilor dintr-un anumit departament din companie

    //15. scrie o metoda care printeaza strada adresei unui anumit angajat din companie

    //17. scrie o metoda care cauta un angajat (dupa nume) intr-un anumit departament din companie si ii afiseaza numele, daca il gaseste

    //18. scrie o metoda care printeaza toti angajatii din toate departamentele din companie

    //19. scrie o metoda care printeaza numarul total de angajati din toate departamentele din companie

    //20. scrie o metoda care cauta un angajat in toate departamentele din companie si ii afiseaza numele, daca il gaseste

    //21. scrie o metoda care printeaza numele angajatului cu cel mai mare salariu dintr-un anumit departament

    //22. scrie o metoda care printeaza numele angajatului cu cel mai mare salariu din companie

    //23. scrie o metoda care printeaza numele angajatului cu cel mai mic salariu din companie
}

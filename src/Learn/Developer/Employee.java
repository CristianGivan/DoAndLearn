package Learn.Developer;

public class Employee implements Developer,Manager {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public void implementFeature() {
        System.out.println("Implement feature as a employee");
    }

    @Override
    public void solveBugs() {
        System.out.println("Solve bugs as a employee");
    }

    @Override
    public void writeDocumentation() {
        System.out.println("Write documentation as a employee");
    }

    @Override
    public void evaluatePeople() {
        System.out.println("Evaluate people as a employee");
    }

    @Override
    public void delegateTasks() {
        System.out.println("Delegate tasks as a employee");
    }
}

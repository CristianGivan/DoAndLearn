package Learn.Developer;

public class Main {
    public static void main(String[] args) {
        Developer[] developers=new Developer[3];
        developers[0]=new Employee("Ana", 1000);
        developers[1]=new Freelancer("Geo", 300);
        developers[2]=new Employee("Cri",1200);

        DevDepartment devDepartment=new DevDepartment(developers);
        devDepartment.solveProductionBugs();

    }
}

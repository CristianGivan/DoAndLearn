package Learn.Developer;

public class Freelancer implements Developer {
    private String name;
    private int hourlyRate;

    public Freelancer(String name, int hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    @Override
    public void implementFeature() {
        System.out.println("Implement feature as a freelancer");
    }

    @Override
    public void solveBugs() {
        System.out.println("Solve bugs as a freelancer");
    }

    @Override
    public void writeDocumentation() {
        System.out.println("Write documentation as a freelancer");
    }
}

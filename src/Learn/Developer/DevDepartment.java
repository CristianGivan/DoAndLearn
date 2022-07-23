package Learn.Developer;

public class DevDepartment {
    private Developer[] developers;

    public DevDepartment(Developer[] developers) {
        this.developers = developers;
    }

    public Developer[] getDevelopers() {
        return this.developers;
    }

    public void setDevelopers(Developer[] developers) {
        this.developers = developers;
    }

    public void solveProductionBugs(){
        for (int i=0; i< developers.length; i++){
            this.developers[i].solveBugs();
        }
    }

}

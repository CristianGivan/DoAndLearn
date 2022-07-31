package Curs.ExceptionOOP;

public class School {
    private String schoolName;
    private Team team;

    public School(String schoolName, Team team) {
        this.schoolName = schoolName;
        this.team = team;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}

package Curs.ExceptionOOP;

public class Team {
    private String teamName;
    private Student elev;

    public Team(String teamName, Student elev) {
        this.teamName = teamName;
        this.elev = elev;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}

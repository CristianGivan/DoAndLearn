package Curs.ExceptionOOP;

public class Competition {
    public static void main(String[] args) {


        Student student = new Student();
        Team team = new Team("team1", student);
        // School school= new School();
        try {
            student.setEmailAddress("test");
        }
        catch (InvalidEmail e){
            System.out.println(e.getMessage());
        }


        System.out.println(student.getEmailAddress());
    }
}

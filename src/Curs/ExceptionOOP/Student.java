package Curs.ExceptionOOP;

public class Student {
    private String emailAddress;
    private String studentName;


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) throws InvalidEmail{
        if(!emailAddress.contains("@")){
            throw new InvalidEmail("nu are @");
        }
        this.emailAddress = emailAddress;
    }

    public String getStudentName() throws InvalidEmail{
        if(!emailAddress.contains("@")){
            throw new InvalidEmail("nu are @");
        }
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}

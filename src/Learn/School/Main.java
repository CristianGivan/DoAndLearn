package Learn.School;

public class Main {
    public static void main(String[] args) {
        Person student =new Student("Andrei", "Popescu", "12E");
        student.introduce();
        Person teacher = new Teacher("Ioana","Georgescu","Nustiu","fizica");
        teacher.introduce();
    }
}

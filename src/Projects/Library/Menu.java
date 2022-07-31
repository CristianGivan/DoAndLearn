package Projects.Library;

public class Menu {

    private String[] press={"Press 0 to ","Press 1 to ","Press 2 to ","Press 3 to ","Press 4 to ",
                            "Press 5 to ","Press 6 to ","Press 7 to ","Press 8 to ","Press 9 to "};
    private String[] logIn;

    public Menu(){
        setLogIn();
    }


    private  void setLogIn(){
        this.logIn=new String[4];
        this.logIn[0]=press[0] +"exit";
        this.logIn[1]=press[1] +"log in";
        this.logIn[2]=press[2] +"register";
        this.logIn[3]=press[3] +"help";
    }
    public void displayLogInMenu(){
        System.out.println("Select from 0 to "+logIn.length+" from the to options:");
        for (int i = 0; i < logIn.length; i++) {
            System.out.println(logIn[i]);
        }
    }


}

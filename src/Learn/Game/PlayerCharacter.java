package Learn.Game;

public abstract class PlayerCharacter {
    private String name;
    private int age;

    private int currentLevel;

    public PlayerCharacter(String name, int age, int currentLevel) {
        this.name = name;
        this.age = age;
        this.currentLevel=currentLevel;
    }

    public void run() {
        System.out.println("Run! " + this.name);
    }

    public void speak() {
        System.out.println("Mi name is " + this.name + "and I am " + this.age);
    }

    public abstract void attack();
    /*
    {
        System.out.println("Attack! " + this.name);
    }
*/

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }
}

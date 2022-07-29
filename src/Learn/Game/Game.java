package Learn.Game;

public class Game {
    public static void main(String[] args) {
//        PlayerCharacter player1= new PlayerCharacter("player",21);
//        player1.run();
//        player1.speak();
//        System.out.println(player1.getName());

        Archer archer= new Archer("legolas",22,12, 1);
        System.out.println(archer.getNumberOfArrows());
        System.out.println(archer instanceof Archer);
//        System.out.println(player1 instanceof Archer);
        System.out.println(archer instanceof PlayerCharacter);
        archer.speak();
        PlayerCharacter wizerd = new Wizard("Gandalf", 23,30,1);
        wizerd.attack();
        //doAllPlayerActions(player1);
        doAllPlayerActions(archer);
        doAllPlayerActions(wizerd);
        System.out.println(archer.getCurrentLevel());
        archer.levelUp();
        System.out.println(archer.getCurrentLevel());
    }

    public static void doAllPlayerActions (PlayerCharacter playerCharacter){
        playerCharacter.speak();
        playerCharacter.run();
        playerCharacter.attack();

    }
}

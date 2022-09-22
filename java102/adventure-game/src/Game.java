import java.util.Scanner;

public class Game{
    private Scanner s = new Scanner(System.in);
    void start(){
        System.out.println("#### Welcome to adventure game ! ####");
        System.out.print("Enter your character name : ");
        String playerName = s.next();
        Player player = new Player(playerName);
        player.createCharacter();
        player.selectLocation();


    }




}

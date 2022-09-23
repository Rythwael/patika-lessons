import java.util.Scanner;

public class Game{
    private Scanner s = new Scanner(System.in);
    void start(){
        System.out.println("#### Welcome to adventure game ! ####");
        Player player = new Player("Gylph");
        player.createCharacter();
        player.selectLocation();


    }




}

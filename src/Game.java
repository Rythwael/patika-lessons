import java.sql.SQLOutput;
import java.util.Scanner;

public class Game{
    public void start(){
        System.out.println("#### Welcome to adventure game ! ####");
        createCharacter();

    }

    void createCharacter() {
        System.out.print("Enter your character name : ");
        Scanner s = new Scanner(System.in);
        String playerName = s.next();
        Characters samurai = new Characters("Samurai", 21, 5, 15);
        Characters archer = new Characters("Archer", 18, 7, 20);
        Characters knight = new Characters("Knight", 24, 8, 5);
        boolean charCreation = true;
        Player player = new Player("tempCharName", 1, 1, 1, "playerName");
        //Character Creation Check
        while (charCreation) {
            System.out.println("CN=ClassName\tH=Health\tD=Damage\tM=StartingMoney");
            System.out.println("ID \t CN \t H \t D \t M");
            System.out.println("1\t" + samurai.getCharName() + "\t" + samurai.getHealth() + "\t" + samurai.getDamage() + "\t" + samurai.getMoney());
            System.out.println("2\t" + archer.getCharName() + "\t" + archer.getHealth() + "\t" + archer.getDamage() + "\t" + archer.getMoney());
            System.out.println("3\t" + knight.getCharName() + "\t" + knight.getHealth() + "\t" + knight.getDamage() + "\t" + knight.getMoney());
            System.out.print("Enter ID of the character you want to play : ");
            int id = s.nextInt();
            switch (id) {
                case 1:
                    player.setCharName(samurai.getCharName());
                    player.setHealth(samurai.getHealth());
                    player.setDamage(samurai.getDamage());
                    player.setMoney(samurai.getMoney());
                    charCreation = false;
                    break;
                case 2:
                    player.setCharName(archer.getCharName());
                    player.setHealth(archer.getHealth());
                    player.setDamage(archer.getDamage());
                    player.setMoney(archer.getMoney());
                    charCreation = false;
                    break;
                case 3:
                    player.setCharName(knight.getCharName());
                    player.setHealth(knight.getHealth());
                    player.setDamage(knight.getDamage());
                    player.setMoney(knight.getMoney());
                    charCreation = false;
                    break;
                default:
                    System.out.println("You entered wrong number!");
            }
        }
        System.out.println("Your class : " + player.getCharName());
        System.out.println("Stats :" + "\nHealth = " + player.getHealth() + "\nDamage = " + player.getDamage() + "\nMoney = " + player.getMoney());
    }
}

import Classes.Archer;
import Classes.Characters;
import Classes.Knight;
import Classes.Samurai;

import java.util.Scanner;

public class Player{
    private String charName;
    private int health;
    private int damage;
    private int money;

    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    Scanner s = new Scanner(System.in);

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    void createCharacter() {
        Characters[] characters = {new Samurai(), new Archer(),new Knight()};
        boolean charCreation = true;
        //Character Creation Check
        while (charCreation) {
            System.out.println("CN=ClassName\tH=Health\tD=Damage\tM=StartingMoney");
            System.out.println("ID \t CN \t H \t D \t M");
            for (int i=0;i<characters.length;i++){
                System.out.println((i+1) + "\t" +
                        characters[i].getCharName() + "\t"
                        + characters[i].getHealth() + "\t"
                        + characters[i].getDamage() + "\t"
                        + characters[i].getMoney());
            }
            System.out.print("Enter ID of the character you want to play : ");
            int id = s.nextInt();
            if (id>0 && id<4){
                this.setCharName(characters[id-1].getCharName());
                this.setHealth(characters[id-1].getHealth());
                this.setDamage(characters[id-1].getDamage());
                this.setMoney(characters[id-1].getMoney());
                charCreation = false;
            }else {
                System.out.println("You entered wrong number!");
            }
        }
        System.out.println("Your class : " + charName);
        System.out.println("Stats :" + "\tHealth=" + health + "\tDamage=" + damage + "\tMoney=" + money);

    }
    void selectLocation(){
        Location location = null;
        boolean selLoc = true;
        System.out.println("Area :\n1 - Safe House\n2 - Tool House\nPlease choose the area you want to go");
        int selectLoc = s.nextInt();
        while (selLoc){
            switch (selectLoc){
                case 1:
                    location = new SafeHouse(this);
                    break;
                case 2:
                    location = new ToolHouse(this);
                    break;
                default:
                    System.out.println("Wrong input!");
            }
            if(!location.onLocation()) {
                System.out.println("Game Over!");
                break;
            }
        }
    }

}


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
    private Inventory inventory;
    Scanner s = new Scanner(System.in);


    public Player(String playerName) {
        this.playerName = playerName;
        this.inventory = new Inventory();
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

    }
    void selectLocation(){
        Location location = null;
        while (true){
            printInfo();
            System.out.println("MAP :\nSafe Areas\n1-Safe House\t2 - Tool House\nDangerous Areas\n3-Cave\t4-Forest\t5-River\n6-Leave Game\nPlease choose the area you want to go");
            int selectLoc = s.nextInt();
            switch (selectLoc){
                case 1:
                    location = new SafeHouse(this);
                    break;
                case 2:
                    location = new ToolHouse(this);
                    break;
                case 3:
                    location = new Cave(this);
                    break;
                case 4:
                    location = new Forest(this);
                    break;
                case 5:
                    location = new River(this);
                    break;
                case 6:
                    location = null;
                    break;
                default:
                    System.out.println("Wrong input!");
            }
            if (location == null){
                System.out.println("See you again!");
                break;
            }
            if(!location.onLocation()) {
                System.out.println("Game Over!");
                break;
            }
        }
    }

    void printInfo(){
        System.out.println("---------");
        System.out.println(
                "Class : " + this.getCharName() +
                "\nWeapon : " + this.getInventory().getWeapon().getName() +
                "\nArmor : " + this.getInventory().getArmor().getName() +
                "\nBlock : " + this.getInventory().getArmor().getBlock() +
                "\nHealth : " + this.getHealth() +
                "\nDamage : " + this.getTotalDamage() +
                "\nMoney : " + this.getMoney());
        System.out.println("---------");

    }
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

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

    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
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

}


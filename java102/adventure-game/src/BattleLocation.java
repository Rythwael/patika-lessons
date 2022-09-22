import Monsters.Monster;

public class BattleLocation extends Location {
    private Monster monster;
    private String loot;
    private int spawnedAmount;
    public BattleLocation(Player player, String name,Monster monster,String loot,int spawnedAmount){
        super(player,name);
        this.monster = monster;
        this.loot = loot;
        this.spawnedAmount = spawnedAmount;
    }

    @Override
    public boolean onLocation() {
        System.out.println("You're here : " + this.getLocationName());
        System.out.println("Be Careful! " + this.getSpawnedAmount() + " " + this.getMonster().getName() + "s are living here!");
        System.out.println("-----Actions-----\nA-Attack\tR-Run");
        String actionKey = s.next().toUpperCase();
        if (actionKey.equals("A")){
            System.out.println("Battle Start!");
        }
        return true;
    }

    public int getSpawnedAmount() {
        return spawnedAmount;
    }

    public void setSpawnedAmount(int spawnedAmount) {
        this.spawnedAmount = spawnedAmount;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getLoot() {
        return loot;
    }

    public void setLoot(String loot) {
        this.loot = loot;
    }
}

import Monsters.Bear;
import Monsters.Monster;
import Monsters.Vampire;
import Monsters.Zombie;

public class BattleLocation extends Location {
    private int id;
    private Monster monster;
    private boolean clear;
    private int spawnedAmount;
    public BattleLocation(Player player, int id, String name, Monster monster, int spawnedAmount){
        super(player,name);
        this.id=id;
        this.monster = monster;
        this.spawnedAmount = spawnedAmount;
        this.clear = false;
    }

    @Override
    public boolean onLocation() {
        System.out.println("You're here : " + this.getLocationName());
        System.out.println("Be Careful! " + this.getSpawnedAmount() + " " + this.getMonster().getName() + "s are living here!");
        System.out.println("-----Actions-----\nF-Fight\tR-Run");
        String actionKey = s.next().toUpperCase();
        if (actionKey.equals("F") && combat(this.getSpawnedAmount())){
            System.out.println("You have cleared " + this.getLocationName());
            double loot=Math.random();
            switch (this.getId()){
                case 1:
                    this.getPlayer().getInventory().setFood(true);
                    break;
                case 2:
                    this.getPlayer().getInventory().setFirewood(true);
                    break;
                case 3:
                    this.getPlayer().getInventory().setWater(true);
                    break;
                default:
                    if (loot<0.45){
                        System.out.println("You dropped nothing");;
                    }else if (loot<60){
                        int weaponLootID=0;
                        loot = Math.random();
                        if (loot<50){
                            System.out.println("You dropped Pistol");
                            weaponLootID=1;
                        }else if (loot<80){
                            System.out.println("You dropped Sword");
                            weaponLootID=2;
                        }else {
                            System.out.println("You dropped Rifle");
                            weaponLootID=3;
                        }
                        if (this.getPlayer().getInventory().getWeapon().getDamage()<Weapon.getWeaponByID(weaponLootID).getDamage()){
                            this.getPlayer().getInventory().setWeapon(Weapon.getWeaponByID(weaponLootID));
                        }
                    }else if (loot<75){
                        //armor
                        int armorLootID=0;
                        loot = Math.random();
                        if (loot<50){
                            System.out.println("You dropped Light Armor");
                            armorLootID=1;
                        }else if (loot<80){
                            System.out.println("You dropped Medium Armor");
                            armorLootID=2;
                        }else {
                            System.out.println("You dropped Heavy Armor");
                            armorLootID=3;
                        }
                        if (this.getPlayer().getInventory().getArmor().getBlock()<Armor.getArmorByID(armorLootID).getBlock()){
                            this.getPlayer().getInventory().setWeapon(Weapon.getWeaponByID(armorLootID));
                    }else {
                            loot = Math.random();
                            if (loot<50){
                                System.out.println("You dropped 1 Gold.");
                                this.getPlayer().setMoney(this.getPlayer().getMoney()+1);
                            }else if (loot<80){
                                System.out.println("You dropped 5 Gold.");
                                this.getPlayer().setMoney(this.getPlayer().getMoney()+5);
                            }else {
                                System.out.println("You dropped 10 Gold.");
                                this.getPlayer().setMoney(this.getPlayer().getMoney()+10);
                            }
                        }
                    }
            }
            return true;
        }
        if (this.getPlayer().getCurrentHealth()<=0){
            System.out.println("You are dead.\nGAME OVER!");
            return false;
        }
        return true;
    }

    public  boolean combat(int monsterAmount){
        //Create Enemies
        int aliveCount = monsterAmount;
        Monster[] monsters = new Monster[monsterAmount];
        for (int i=0;i<monsterAmount;i++){
            if (this.getId()==1) {
                monsters[i]= new Zombie();
            } else if (this.getId()==2) {
                monsters[i]= new Vampire();
            }else {
                monsters[i]= new Bear();
            }
        }
        //Fighting Loop
        boolean isOver = false;
        int turn = (int)(Math.random()*2);
        while (!isOver){
            if (turn==0) {
                playerStats();
                enemyStats(monsters);
                System.out.println("Player's Turn");
                //Choose Target
                System.out.println("Choose your target :");
                int selectTarget = s.nextInt();

                while (selectTarget < 1 || selectTarget > monsterAmount) {
                    System.out.println("You choose wrong target.");
                    selectTarget = s.nextInt();
                }
                if (monsters[selectTarget - 1].getCurrentHealth() == 0) {
                    System.out.println("Target is dead.");
                } else if (this.getPlayer().getCurrentHealth() > 0) {
                    playerStats();
                    enemyStats(monsters);
                    //Select Action
                    System.out.println("-----Actions-----\nA-Attack\tR-Run");
                    String combatSelect = s.next().toUpperCase();
                    //Fight
                    if (combatSelect.equals("A")) {
                        //Player Hit
                        System.out.println("You deal " + this.getPlayer().getTotalDamage() + " damage.");
                        monsters[selectTarget - 1].setCurrentHealth(monsters[selectTarget - 1].getCurrentHealth() - this.getPlayer().getTotalDamage());
                        if (monsters[selectTarget - 1].getCurrentHealth() <= 0) {
                            monsters[selectTarget - 1].setCurrentHealth(0);
                            System.out.println("You killed " + monsters[selectTarget - 1].getName());
                            aliveCount--;
                        }

                    } else if (combatSelect.equals("R")) {
                        System.out.println("You ran away.");
                        return false;
                    } else {
                        System.out.println("Wrong input");
                    }

                }
                turn=1;
            }
            if (turn==1) {
                playerStats();
                enemyStats(monsters);
                System.out.println("Enemy's Turn");
                if (aliveCount>0){
                    int finalMonsterDamage = aliveCount*(this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock());
                    if (finalMonsterDamage<0){
                        finalMonsterDamage = 0;
                    }
                    System.out.println(this.getMonster().getName() + " deal " + finalMonsterDamage + " damage.");
                    this.getPlayer().setCurrentHealth(this.getPlayer().getCurrentHealth()-finalMonsterDamage);
                    if (this.getPlayer().getCurrentHealth()<=0){
                        return false;
                    }
                }
                turn=0;
            }

                if (aliveCount==0){
                    System.out.println("You killed all monsters");
                    int rewardAmount = monsterAmount*this.getMonster().getReward();
                    System.out.println("You gain " + rewardAmount + " gold.");
                    this.getPlayer().setMoney(this.getPlayer().getMoney()+rewardAmount);
                    isOver = true;
                }
            }
        return true;

    }

    public void playerStats(){
        System.out.println("--Player Status--");
        System.out.println("HP:"+this.getPlayer().getCurrentHealth() + "/" + this.getPlayer().getMaxHealth()
        + " DMG:"+this.getPlayer().getDamage() + " Money:"+this.getPlayer().getMoney());
    }

    public void enemyStats(Monster[] monsters){
        System.out.println("--Enemy Status--");
        for (int i=0;i<monsters.length;i++){
            System.out.println(
                    (i+1) +  " - " + monsters[i].getName() + " " +
                    "HP:"+ monsters[i].getCurrentHealth() + "/" + monsters[i].getMaxHealth() +
                    " DMG:"+monsters[i].getDamage() +
                    " Reward:" + monsters[i].getReward()
            );
        }
    }

    public boolean isClear() {
        return clear;
    }

    public void setClear(boolean clear) {
        this.clear = clear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

}

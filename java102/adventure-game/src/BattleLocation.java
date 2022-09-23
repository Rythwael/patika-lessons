import Monsters.Bear;
import Monsters.Monster;
import Monsters.Vampire;
import Monsters.Zombie;

public class BattleLocation extends Location {
    private int id;
    private Monster monster;
    private String loot;
    private boolean clear;
    private int spawnedAmount;
    public BattleLocation(Player player, int id, String name,Monster monster,String loot,int spawnedAmount){
        super(player,name);
        this.id=id;
        this.monster = monster;
        this.loot = loot;
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
            switch (this.getId()){
                case 1:
                    this.getPlayer().getInventory().setFood(true);
                    break;
                case 2:
                    this.getPlayer().getInventory().setFirewood(true);
                    break;
                default:
                    this.getPlayer().getInventory().setWater(true);
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
        while (!isOver){
            //Show Current Status
            playerStats();
            enemyStats(monsters);
            //Choose Target
            System.out.println("Choose your target :");
            int selectTarget = s.nextInt();

            while (selectTarget<1 || selectTarget>monsterAmount){
                System.out.println("You choose wrong target.");
                selectTarget = s.nextInt();
            }
            if (monsters[selectTarget-1].getCurrentHealth()==0){
                System.out.println("Target is dead.");
            }else if (this.getPlayer().getCurrentHealth()>0){
                    playerStats();
                    enemyStats(monsters);
                    //Select Action
                    System.out.println("-----Actions-----\nA-Attack\tR-Run");
                    String combatSelect = s.next().toUpperCase();
                    //Fight
                    if (combatSelect.equals("A")){
                        //Player Hit
                        System.out.println("You deal " + this.getPlayer().getTotalDamage() + " damage.");
                        monsters[selectTarget-1].setCurrentHealth(monsters[selectTarget-1].getCurrentHealth()-this.getPlayer().getTotalDamage());
                        if (monsters[selectTarget-1].getCurrentHealth()<=0){
                            monsters[selectTarget-1].setCurrentHealth(0);
                            aliveCount--;
                        }
                        afterHit(monsters[selectTarget-1]);
                        //Enemy Hit
                        if (aliveCount>0){
                            int finalMonsterDamage = aliveCount*(monsters[selectTarget-1].getDamage() - this.getPlayer().getInventory().getArmor().getBlock());
                            if (finalMonsterDamage<0){
                                finalMonsterDamage = 0;
                            }
                            System.out.println(monsters[selectTarget-1].getName() + " deal " + finalMonsterDamage + " damage.");
                            this.getPlayer().setCurrentHealth(this.getPlayer().getCurrentHealth()-finalMonsterDamage);
                            if (this.getPlayer().getCurrentHealth()<=0){
                                return false;
                            }
                            afterHit(monsters[selectTarget-1]);
                        }else {
                            System.out.println("You killed " + monsters[selectTarget-1].getName());
                            System.out.println();
                        }
                        if (aliveCount==0){
                            System.out.println("You killed all monsters");
                            int rewardAmount = monsterAmount*this.getMonster().getReward();
                            System.out.println("You gain " + rewardAmount + " gold.");
                            this.getPlayer().setMoney(this.getPlayer().getMoney()+rewardAmount);
                            isOver = true;
                        }
                    } else if (combatSelect.equals("R")) {
                        System.out.println("You ran away.");
                        return false;
                    } else {
                        System.out.println("Wrong input");
                    }
                }
            }
        return true;

    }



    public void afterHit(Monster enemy){
        System.out.println("Your HP:" + this.getPlayer().getCurrentHealth() + "/" + this.getPlayer().getMaxHealth());
        System.out.println("Enemy HP:" + enemy.getCurrentHealth());
        System.out.println();
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

    public String getLoot() {
        return loot;
    }

    public void setLoot(String loot) {
        this.loot = loot;
    }
}

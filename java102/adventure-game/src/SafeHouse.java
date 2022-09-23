public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player){
        super(player,"Safe House");
    }

    @Override
    public boolean onLocation(){
        if (this.getPlayer().getInventory().isFirewood()&&this.getPlayer().getInventory().isWater()&&this.getPlayer().getInventory().isFood()){
            System.out.println("Congratulations ! You finished the game!");
            return false;
        }
        System.out.println("You're in Safe House.\tYour HP is full.");
        this.getPlayer().setCurrentHealth(this.getPlayer().getMaxHealth());

        return true;
    }

}

public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player){
        super(player,"Safe House");
    }

    @Override
    public boolean onLocation(){
        System.out.println("You're in Safe House.\tYour HP is full.");
        this.getPlayer().setCurrentHealth(this.getPlayer().getMaxHealth());
        return true;
    }

}

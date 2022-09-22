public class ToolHouse extends NormalLocation{
    public ToolHouse(Player player){
        super(player,"Shop");
    }

    @Override
    public boolean onLocation() {
        System.out.println("-----Welcome to Tool House-----");
        System.out.println("1 - Weapons\n2 - Armors\n3 - Leave");
        System.out.print("Selection : ");
        int selectOption = s.nextInt();
        while (selectOption<1 || selectOption>3){
            System.out.println("Wrong input");
            selectOption = s.nextInt();
        }
        switch (selectOption){
            case 1:
                printWeapons();
                break;
            case 2:
                printArmors();
                break;
            case 3:
                System.out.println("See you later!");
                return true;
        }
        return true;
    }

    public void printWeapons(){
        System.out.println("---Weapons---");
        for (Weapon w: Weapon.weapons()){
            System.out.println(w.getId() + "\t" + w.getName() + "\tDamage=" + w.getDamage() + "\tPrice=" + w.getPrice());
        }
        buyWeapon();

    }
    public void buyWeapon(){
        System.out.print("Your input : ");
        int selectWeaponID = s.nextInt();
        while (selectWeaponID<1 || selectWeaponID>3){
            System.out.println("Wrong input");
            System.out.print("Your input : ");
            selectWeaponID = s.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponByID(selectWeaponID);
        if (selectedWeapon.getPrice() > this.getPlayer().getMoney()){
            System.out.println("Not enough money!");
        }else {
            System.out.println("You've bought " + selectedWeapon.getName());
            int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
            this.getPlayer().setMoney(balance);
            System.out.println("Current balance : " + this.getPlayer().getMoney());
            this.getPlayer().getInventory().setWeapon(selectedWeapon);

        }
    }

    void printArmors(){
        System.out.println("Armors");
    }
}

public class Inventory {
    boolean water;
    boolean food;
    boolean firewood;
    String weaponName;
    String armorName;
    int weaponDamage;
    int armorValue;

    public Inventory(boolean water, boolean food, boolean firewood, String weaponName, String armorName, int weaponDamage, int armorValue) {
        this.water = water;
        this.food = food;
        this.firewood = firewood;
        this.weaponName = weaponName;
        this.armorName = armorName;
        this.weaponDamage = weaponDamage;
        this.armorValue = armorValue;
    }
}

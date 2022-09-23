package Monsters;

public class Monster {
    private int id;
    private String name;
    private int damage;
    private int currentHealth;
    private int maxHealth;
    private int reward;

    public Monster(int id, String name, int damage,  int maxHealth, int reward) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.currentHealth = maxHealth;
        this.maxHealth = maxHealth;
        this.reward = reward;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
}

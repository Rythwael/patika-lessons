public class Fighter {
    String name;
    int dmg;
    int hp;
    double evasion;

    Fighter(String name,int dmg,int hp, double evasion){
        this.name = name;
        this.dmg = dmg;
        this.hp = hp;
        this.evasion = evasion;
    }

    public int hit(Fighter enemy){
        System.out.println(this.name + " deals " + this.dmg + " to " + enemy.name + "!");
        if (isDodge(enemy.evasion)){
            System.out.println(enemy.name + " dodged.");
            return enemy.hp;
        } else {
            if (enemy.hp<this.dmg) {
                return 0;
            }
            return enemy.hp-this.dmg;
        }

    }
    public boolean isDodge(double evasion){
        if (evasion>=100){
            evasion=99.9;
        }
        double randomValue = Math.random()*100;
        return evasion<=randomValue;
    }
}

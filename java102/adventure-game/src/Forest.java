import Monsters.Vampire;

public class Forest extends BattleLocation{
    public Forest(Player player) {
        super(player, 2,"Forest", new Vampire(), ((int)((Math.random()*3)+1)));
    }
}

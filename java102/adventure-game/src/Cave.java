import Monsters.Zombie;

public class Cave extends BattleLocation{
    public Cave(Player player) {
        super(player, 1,"Cave", new Zombie(), ((int)((Math.random()*3)+1)));
    }
}

import Monsters.Zombie;

public class Cave extends BattleLocation{
    public Cave(Player player) {
        super(player, "Cave", new Zombie(),"food",((int)((Math.random()*3)+1)));
    }
}

import Monsters.Vampire;

public class Forest extends BattleLocation{
    public Forest(Player player) {
        super(player, "Forest", new Vampire(),"firewood",((int)((Math.random()*3)+1)));
    }
}

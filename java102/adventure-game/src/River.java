import Monsters.Bear;

public class River extends BattleLocation{
    public River(Player player) {
        super(player, "River", new Bear(),"water",((int)((Math.random()*3)+1)));
    }
}

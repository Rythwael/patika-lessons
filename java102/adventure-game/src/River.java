import Monsters.Bear;

public class River extends BattleLocation{
    public River(Player player) {
        super(player,3, "River", new Bear(), ((int)((Math.random()*3)+1)));
    }
}

import Monsters.Snake;

public class Quarry extends BattleLocation{

    public Quarry(Player player) {
        super(player, 4, "Quarry", new Snake(), ((int)((Math.random()*5)+1)));
    }
}

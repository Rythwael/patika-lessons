public class Player extends Characters{
    private String charName;
    private int health;
    private int damage;
    private int money;
    private String playerName;

    public Player(String charName, int health, int damage, int money, String playerName) {
        super(charName,health,damage,money);
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

}

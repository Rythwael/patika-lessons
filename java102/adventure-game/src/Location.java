import java.util.Scanner;

public abstract class Location {
    private Player player;
    private String locationName;
    protected Scanner s = new Scanner(System.in);

    public Location(Player player, String locationName) {
        this.player = player;
        this.locationName = locationName;
    }
    public abstract boolean onLocation();
}

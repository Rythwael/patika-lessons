public class ToolHouse extends NormalLocation{
    public ToolHouse(Player player){
        super(player,"Shop");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to Tool House");
        return true;
    }
}

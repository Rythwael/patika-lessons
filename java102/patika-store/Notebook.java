public class Notebook {
    private int productNumber;
    private int basePrice;
    private int stock;
    private String name;
    private String brand;
    private int RAM;
    private int memory;
    private double screenSize;

    public Notebook(int productNumber, int basePrice, int stock, String name, String brand, int RAM, int memory, double screenSize) {
        this.productNumber = productNumber;
        this.basePrice = basePrice;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
        this.RAM = RAM;
        this.memory = memory;
        this.screenSize = screenSize;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}

public abstract class Consoles implements IConsoles {
    // Variables to store the data
    protected String consoleType;
    protected String storeName;
    protected int totalSales;

    // Constructor that accepts the parameters
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Implementing the methods from the IConsoles interface
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}

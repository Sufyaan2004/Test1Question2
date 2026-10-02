public class ConsoleSales extends Consoles {

    // Constructor that passes the parameters up to the parent class (Consoles)
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // Method to print the report as requested
    public void printReport() {
        System.out.println("----------------------------------------");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("----------------------------------------");
        System.out.println("Console Type : " + getConsoleType());
        System.out.println("Store Name   : " + getStore());
        System.out.println("Total Sales  : " + getTotalSales());
        System.out.println("----------------------------------------");
    }
}

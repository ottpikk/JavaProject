package liveCoding.invoiceTask;

public class Item {
    private String productName;
    private String description;
    private double unitPrice;

    public Item(String productName, String description, double unitPrice) {
        this.productName = productName;
        this.description = description;
        this.unitPrice = unitPrice;
    }
    public String getProductName() {
        return this.productName;
    }
    public String getDescription() {
        return this.description;
    }
    public double getUnitPrice() {
        return this.unitPrice;
    }
}

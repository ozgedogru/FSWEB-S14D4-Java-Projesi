public class Chocolate extends ProductForSale {
    private String milkContent;

    public Chocolate(String type, double price, String description, String milkContent) {
        super(type, price, description);
        this.milkContent = milkContent;
    }

    public String getMilkContent() {
        return milkContent;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: $" + getPrice() + ", Description: " + getDescription() + ", Brand: " + getMilkContent());

    }
}

public class Bread extends ProductForSale{
    private String flour;
    public Bread(String type, double price, String description, String flour) {
        super(type, price, description);
        this.flour = flour;
    }

    public String getFlour() {
        return flour;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: $" + getPrice() + ", Description: " + getDescription() + ", Brand: " + getFlour());

    }
}

public class Store {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("Chocolate", 2.99, "Delicious Milk Chocolate", "White milk");
        Bread bread = new Bread("Bread", 1.49, "Whole Wheat Bread", "Brown bread");
        Coke coke = new Coke("Coke", 1.00, "Refreshing Soda", "CocaCola");

        ProductForSale[] products = { chocolate, bread, coke };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products) {
            product.showDetails();
        }
    }

}
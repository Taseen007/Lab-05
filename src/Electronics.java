public class Electronics extends Product{
    private static final double TAX_RATE = 0.15;

    public Electronics(String name, int stockQuantity, double price ){
        super(name, stockQuantity, price);
    }


    public double calculateTotalPrice() {
        return getUnitPrice() * (1 + TAX_RATE);
    }
}





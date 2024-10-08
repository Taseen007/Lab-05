public abstract class Product {

        private String name;
        private int stockQuantity;
        private double unitPrice;


        public Product(String name, int stockQuantity, double unitPrice) {
            this.name = name;
            this.stockQuantity = stockQuantity;
            this.unitPrice = unitPrice;
        }

        public abstract double calculateTotalPrice();

        public String getName() {
            return name;
        }



        public int getStockQuantity() {
            return stockQuantity;
        }

        public double getUnitPrice() {
            return unitPrice;

        }
}



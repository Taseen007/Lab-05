import java.util.*;

    public class OrderManager {
        public static List<Product> sortProducts(List<Product> products) {

            Collections.sort(products, new Comparator<Product>() {
                @Override
                public int compare(Product p1, Product p2) {
                    int priceComparison = Double.compare(p1.calculateTotalPrice(), p2.calculateTotalPrice());
                    if (priceComparison != 0) {
                        return priceComparison;
                    }

                    int nameComparison = p1.getName().compareTo(p2.getName());
                    if (nameComparison != 0) {
                        return nameComparison;

                    }

                    return Integer.compare(p1.getStockQuantity(), p2.getStockQuantity());
                }
            }

            );
            return products;

        }


    }



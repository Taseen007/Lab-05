import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



    public class ProductTest {
        @Test
        public void testSorting() {
            Product e1 = new Electronics("Phone", 10, 500);
            Product c1 = new Clothing("Shirt", 20, 50);
            Product f1 = new Furniture("Table", 5, 150);

            List<Product> products = new ArrayList<>();
            products.add(e1);
            products.add(c1);
            products.add(f1);

            OrderManager.sortProducts(products);

            assertEquals("Shirt", products.get(0).getName());
            assertEquals("Table", products.get(1).getName());
            assertEquals("Phone", products.get(2).getName());
        }

        @Test
        public void testAddingNewProductType() {
            Product furniture = new Furniture("Action Figure", 30, 50);
            Product electronics = new Electronics("TV", 5, 600);

            List<Product> products = new ArrayList<>(Arrays.asList(furniture, electronics));
            double totalToysPrice = furniture.calculateTotalPrice();
            double totalElectronicsPrice = electronics.calculateTotalPrice();

            assertTrue(totalToysPrice < totalElectronicsPrice);
        }


        @Test
        public void testTotalPriceForMultipleProducts() {
            Product electronics = new Electronics("Headphones", 10, 200);
            Product clothing = new Clothing("T-shirt", 20, 30);
            Product furniture = new Furniture("Desk", 3, 500);

            List<Product> products = Arrays.asList(electronics, clothing, furniture);
            double totalPrice = products.stream().mapToDouble(Product::calculateTotalPrice).sum();

            double expectedTotalPrice = (200 * 1.15) + (30 * 1.10) + (500 * 1.08);
            assertEquals(expectedTotalPrice, totalPrice, 0.01);
        }









    }



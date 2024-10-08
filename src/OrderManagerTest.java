import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderManagerTest {
    @Test
    public void testSortByTotalPrice() {
        Product electronics = new Electronics("Laptop", 10, 1500);
        Product clothing = new Clothing("Jeans", 20, 60);
        Product furniture = new Furniture("Chair", 5, 100);

        List<Product> products = new ArrayList<>(Arrays.asList(electronics, clothing, furniture));
        OrderManager.sortProducts(products);

        assertEquals("Jeans", products.get(0).getName());
        assertEquals("Chair", products.get(1).getName());
        assertEquals("Laptop", products.get(2).getName());
    }

    @Test
    public void testSortByNameWhenPricesEqual() {
        Product electronics = new Electronics("Phone", 10, 500);
        Product clothing = new Clothing("Hat", 20, 500);

        List<Product> products = new ArrayList<>(Arrays.asList(electronics, clothing));
        OrderManager.sortProducts(products);

        assertEquals("Hat", products.get(0).getName());
        assertEquals("Phone", products.get(1).getName());
    }


    @Test
    public void testSortByStockWhenPriceAndNameEqual() {
        Product electronics1 = new Electronics("Tablet", 5, 300);
        Product electronics2 = new Electronics("Tablet", 10, 300);

        List<Product> products = new ArrayList<>(Arrays.asList(electronics2, electronics1));
        OrderManager.sortProducts(products);

        assertEquals(5, products.get(0).getStockQuantity());
        assertEquals(10, products.get(1).getStockQuantity());
    }




}
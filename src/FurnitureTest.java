import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FurnitureTest {

    @Test
    public void testFurnitureTotalPrice() {
        Product furniture = new Furniture("Table", 5, 200);
        double expectedTotalPrice = 200 + (200 * 0.08);
        assertEquals(expectedTotalPrice, furniture.calculateTotalPrice(), 0.01);
    }


}
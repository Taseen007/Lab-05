import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClothingTest {

    @Test
public void testClothingTotalPrice() {
    Product clothing = new Clothing("Shirt", 20, 50);
    double expectedTotalPrice = 50 + (50 * 0.10);
    assertEquals(expectedTotalPrice, clothing.calculateTotalPrice(), 0.01);

    }


}
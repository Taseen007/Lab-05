import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectronicsTest {

    @Test
    public void testElectronicsTotalPrice() {
        Product electronics = new Electronics("Phone", 10, 1000);
        double expectedTotalPrice = 1000 + (1000 * 0.15);
        assertEquals(expectedTotalPrice, electronics.calculateTotalPrice(), 0.01);
    }


}
package com.stock.control;

import com.stock.control.model.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ProductTest {

    private Product productTest = new Product("Pen", 1000, 2.00);

    @Test
    void test001SetProductAttributes() {
        assertTrue(productTest.getProductName().equals("Pen") && productTest.getProductId() == (1000) &&
                productTest.getProductPrice() == (2.00));
    }
}

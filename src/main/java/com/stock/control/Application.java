package com.stock.control;
//import com.stock.control.control.ControlProducts;

import com.stock.control.model.ProductList;
//import com.stock.control.view.ApplicationView;

public class Application {
    public static void main(String[] args) {

        ProductList productList = new ProductList();
        productList.createProductIntoList("A", 1000, 2.00);
        productList.createProductIntoList("B", 1002, 2.00);
        productList.createProductIntoList("C", 1003, 2.00);
        productList.createProductIntoList("D", 1004, 2.00);
        productList.createProductIntoList("R", 1005, 2.00);

        /*System.out.println("List of Prods");
        productList.printList();

        System.out.println("Read a prod from list");
        productList.readProductFromList(1002);*/

        //System.out.println("List of Prods---------------------------------------------------------------");
        //productList.printList();

        //System.out.println("Update price of prod");
        //productList.updateProductPriceIntoList(1004, 3.00);

        /*System.out.println("List of Prods");
        productList.printList();

        System.out.println("Delete prod");
        productList.deleteProductPriceIntoList(1002);

        System.out.println("List of Prods");
        productList.printList();*/

        System.out.println("List of Prods---------------------------------------------------------------");
        productList.printList();

        System.out.println("Delete prod");
        productList.deleteProductPriceIntoList3(1002);

        System.out.println("List of Prods");
        productList.printList();
    }
}

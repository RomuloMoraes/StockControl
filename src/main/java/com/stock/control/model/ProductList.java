package com.stock.control.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class ProductList {

    private int qttListLine;

    private final List<Product> productList = new ArrayList<>();
    //private final List<Product> productList = new ProductList<>();
    //private Product product;


    public ProductList() {

    }

    //Create
    public void createProductIntoList(String nameProduct, int idProduct, double productPrice) {
        productList.add(new Product(nameProduct, idProduct, productPrice));
    }

    //Read
    public void readProductFromList(int idProduct) {
        Predicate<Product> findProductId = product -> product.getProductId() == idProduct;
        productList.stream()
                .filter(findProductId)
                .forEach(System.out::println);
    }

    //Update
    public void updateProductPriceIntoList(int idProduct, double newProductPrice) {
        Predicate<Product> findProductId = product -> product.getProductId() == idProduct;
        Function<Product, Double> updateProductPrice = product -> product.productPrice = (newProductPrice);
        productList.stream()
                .filter(findProductId)
                .map(updateProductPrice)
                .forEach(System.out::println);
    }

    //Delete
    public void deleteProductPriceIntoList3(int idProduct) {
        for (Product product : productList) {
            if (product.getProductId() == idProduct) {
                productList.remove(product);
                break;
            }
        }
        System.out.println("Product deleted!!!");

    }

    /*
    public void deleteProductPriceIntoList2(int idProduct) {
        Predicate<Product> findProductId = product -> product.getProductId() == idProduct;
        Function<Product, Boolean> removeProd = product -> productList.remove(product);
        Consumer<String> successDeletedProduct = resp -> "Success";

        int productIndex = productList.stream().filter(findProductId).map(removeProd);

    }

    public void deleteProductPriceIntoList(int idProduct) {
        Predicate<Product> findProductId = product -> product.getProductId() == idProduct;
        Function<Product, Integer> getProductIndex = productList::indexOf;
        Function<Integer, Boolean> removeProd = productIndex -> productList.remove(productIndex);
        productList.stream()
                .filter(findProductId)
                .map(getProductIndex)
                .map(removeProd)
                .forEach(System.out::println);
    }*/


    public void printList() {
        System.out.println(productList);
    }
}
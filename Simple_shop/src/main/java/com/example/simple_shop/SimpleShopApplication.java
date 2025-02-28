package com.example.simple_shop;


import com.example.simple_shop.Product.ProductService;
import com.example.simple_shop.Product.ProductStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleShopApplication {

    private static ProductStorage productStorage;
    private static ProductService productService;

    public SimpleShopApplication(ProductStorage productStorage, ProductService productService) {
        SimpleShopApplication.productStorage = productStorage;
        SimpleShopApplication.productService = productService;
    }


    public static void main(String[] args) {
        SpringApplication.run(SimpleShopApplication.class, args);
        run();
    }

    public static void run() {
        productService.addProductToOffer("Cigarette", 14.20d);
        productService.getProductFromOffer("Milk");
        productService.deleteProductFromOffer("Milk");
        productService.printListOfProducts();
    }

}

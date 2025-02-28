/* TODO
> Add functionality to remove product from offer with just a String - name
 */
package com.example.simple_shop.Product;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductStorage productStorage;

    public ProductService(ProductStorage productStorage) {
        this.productStorage = productStorage;
    }

    public void printListOfProducts() {
        for (Product product : productStorage.products) {
            System.out.println(product);
        }
    }

    public Product getProductFromOffer(String name) {
        Product searchedProduct = null;
        for (Product product : productStorage.products) {
            if (product.name.equals(name)) {
                searchedProduct = product;
                break;
            }
        }
        return searchedProduct;
    }

    public void addProductToOffer(String name, double price) {
        productStorage.products.add(new Product(name, price));
    }

    public void deleteProductFromOffer(String name) {
        if (product.get
        }
    }


}



package Demo.Spring.Demo.Spring.service;

import Demo.Spring.Demo.Spring.modele.Product;

import java.util.*;

public interface ProductServiceInt {

    Product createProduct(Product product);

    List<Product> getProducts();

    Product updateProduct(Long id, Product product);

    String deleteProduct(Long id);
}

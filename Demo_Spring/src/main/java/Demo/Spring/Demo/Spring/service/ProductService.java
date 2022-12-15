package Demo.Spring.Demo.Spring.service;

import Demo.Spring.Demo.Spring.modele.Product;
import Demo.Spring.Demo.Spring.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService implements ProductServiceInt {

    private final ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> showProducts() {
        return null;
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public String deleteProduct(Long id) {
        return null;
    }
}

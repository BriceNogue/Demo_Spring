package Demo.Spring.Demo.Spring.service;

import Demo.Spring.Demo.Spring.modele.Product;
import Demo.Spring.Demo.Spring.repository.ProductRepositoryInt;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService implements ProductServiceInt {

    private final ProductRepositoryInt productRepositoryInt;

    @Override
    public Product createProduct(Product product) {
        return productRepositoryInt.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepositoryInt.findAll();
    }

    @Override
    public Product getProduct(Long productId){
        return productRepositoryInt.findById(productId).get();
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return productRepositoryInt.findById(id)
                .map(p -> {
                    p.setPrice(product.getPrice());
                    p.setName(product.getName());
                    p.setDescription(product.getDescription());
                    return productRepositoryInt.save(p);
                }).orElseThrow(() -> new RuntimeException("Product update failed"));
    }

    @Override
    public String deleteProduct(Long id) {
        productRepositoryInt.deleteById(id);
        return "Product deleted!";
    }
}

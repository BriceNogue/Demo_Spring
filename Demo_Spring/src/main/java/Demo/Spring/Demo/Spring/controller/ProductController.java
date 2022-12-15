package Demo.Spring.Demo.Spring.controller;

import Demo.Spring.Demo.Spring.modele.Product;
import Demo.Spring.Demo.Spring.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/createProduct")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(Long id, Product product){
        return productService.updateProduct(id, product);
    }
}

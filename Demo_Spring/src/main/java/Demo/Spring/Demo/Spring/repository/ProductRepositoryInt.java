package Demo.Spring.Demo.Spring.repository;

import Demo.Spring.Demo.Spring.modele.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryInt extends JpaRepository<Product, Long> {
}

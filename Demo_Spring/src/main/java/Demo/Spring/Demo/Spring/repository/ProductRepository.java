package Demo.Spring.Demo.Spring.repository;

import Demo.Spring.Demo.Spring.modele.Product;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

public interface ProductRepository extends JpaAttributeConverter<Product, Long> {
}

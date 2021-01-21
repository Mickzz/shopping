package shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopping.db.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,String> {
    ProductEntity findByproductName(String product);
}

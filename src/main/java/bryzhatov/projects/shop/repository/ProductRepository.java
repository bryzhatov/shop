package bryzhatov.projects.shop.repository;

import bryzhatov.projects.shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-02
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findById(int id);
}

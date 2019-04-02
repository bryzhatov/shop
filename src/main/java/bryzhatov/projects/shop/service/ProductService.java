package bryzhatov.projects.shop.service;

import bryzhatov.projects.shop.entity.Product;
import bryzhatov.projects.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-02
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product get(int id) {
        return productRepository.findById(id);
    }
}

package bryzhatov.projects.shop.controller.rest;

import bryzhatov.projects.shop.entity.Product;
import bryzhatov.projects.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-01
 */
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/{id}")
    public Product get(@PathVariable Integer id) {
        return productService.get(id);
    }

    @RequestMapping("/all")
    public List<Product> getAll() {
        return productService.all();
    }
}

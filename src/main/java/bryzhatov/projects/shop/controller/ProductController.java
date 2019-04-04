package bryzhatov.projects.shop.controller;

import bryzhatov.projects.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-04
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/product/{id}")
    public String get(@PathVariable Integer id, Model model) {
        model.addAttribute("product", productService.get(id));
        return "product";
    }
}

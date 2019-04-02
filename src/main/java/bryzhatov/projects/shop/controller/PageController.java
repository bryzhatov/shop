package bryzhatov.projects.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-01
 */
@Controller
public class PageController {

    @RequestMapping("/t")
    public String index(Map<String, Object> model) {
        return "index";
    }
}

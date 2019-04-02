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

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/signin")
    public String signIn() {
        return "sign_in";
    }
}

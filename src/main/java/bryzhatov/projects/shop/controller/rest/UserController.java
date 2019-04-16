package bryzhatov.projects.shop.controller.rest;

import bryzhatov.projects.shop.entity.User;
import bryzhatov.projects.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-03
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/{id}")
    public User get(@PathVariable Long id) {
        return userService.get(id);
    }
}

package bryzhatov.projects.shop.service;

import bryzhatov.projects.shop.entity.User;
import bryzhatov.projects.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-03
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User get(long id) {
        System.out.println(id);
        return userRepository.findById(id).get();
    }
}

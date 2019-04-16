package bryzhatov.projects.shop.service;

import bryzhatov.projects.shop.entity.User;
import bryzhatov.projects.shop.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-03
 */
@Service
public class UserService implements UserDetailsService {
    //    @Autowired
//    private UserRepository userRepository;
    @Autowired
    private UserDao userDao;

    public User get(long id) {
        return userDao.findById(id).orElseThrow(
                () -> new UsernameNotFoundException("Can't get user by id.")
        );
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.findByUsername(username).orElseThrow(
                () -> new UsernameNotFoundException("Can't get user by id.")
        );
    }
}
package bryzhatov.projects.shop.service;

import bryzhatov.projects.shop.entity.User;
import bryzhatov.projects.shop.repository.UserRepository;
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
    @Autowired
    private UserRepository userRepository;

    public User get(long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User byUsername = userRepository.findByUsername(username);
        System.out.println(byUsername);
        return userRepository.findByUsername(username);
    }
}

//User.builder()
//        .username(username)
//        .password("password")
//        .authorities(Collections.singletonList(Role.USER))
//        .isAccountNonExpired(true)
//        .isAccountNonLocked(true)
//        .isCredentialsNonExpired(true)
//        .isEnabled(true)
//        .build();
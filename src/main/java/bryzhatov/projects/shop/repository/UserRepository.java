package bryzhatov.projects.shop.repository;

import bryzhatov.projects.shop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-03
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findById(int id);
    User findByUsername(String login);
}

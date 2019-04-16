package bryzhatov.projects.shop.repository;

import bryzhatov.projects.shop.entity.Role;
import bryzhatov.projects.shop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-09
 */
@Component
public class UserDao extends JdbcDaoSupport {
    @Autowired
    private DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    public Optional<User> findById(long id) {
        User user = getJdbcTemplate().queryForObject("select * from users where id = ?",
                new Object[]{id},
                getRowMapper());

        if (user != null) {
            user.setAuthorities(getRoles(id));
        }

        return Optional.ofNullable(user);
    }

    public Optional<User> findByUsername(String username) {
        User user = getJdbcTemplate().queryForObject("select * from users where username = ?", new Object[]{username}, getRowMapper());

        if(user != null){
            user.setAuthorities(getRoles(user.getId()));
        }

        return Optional.ofNullable(user);
    }

    private Set<Role> getRoles(long user_id) {
        Set<Role> roles = new TreeSet<>();
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList("select * from user_role where user_id = ?", user_id);

        for (Map<String, Object> row : rows) {
            Role role = Role.valueOf((String) row.get("authorities"));
            roles.add(role);
        }

        return roles;
    }

    private RowMapper<User> getRowMapper() {
        return (resultSet, i) -> getUser(resultSet);
    }

    private User getUser(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setUsername(resultSet.getString("username"));
        user.setLastName(resultSet.getString("last_name"));
        user.setPassword(resultSet.getString("password"));

        user.setCredentialsNonExpired(resultSet.getBoolean("is_credentials_non_expired"));
        user.setAccountNonExpired(resultSet.getBoolean("is_account_non_expired"));
        user.setAccountNonLocked(resultSet.getBoolean("is_account_non_locked"));
        user.setEnabled(resultSet.getBoolean("is_enabled"));
        return user;
    }
}

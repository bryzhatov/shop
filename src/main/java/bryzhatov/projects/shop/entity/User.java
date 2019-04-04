package bryzhatov.projects.shop.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-02
 */
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 15)
    private String name;
    @Column(length = 15)
    private String lastName;
    @Column(length = 20)
    private String login;
    private String password;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    private Set<Role> roles;
}

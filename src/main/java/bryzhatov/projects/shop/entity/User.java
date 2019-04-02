package bryzhatov.projects.shop.entity;

import lombok.Data;

import javax.persistence.*;

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
}

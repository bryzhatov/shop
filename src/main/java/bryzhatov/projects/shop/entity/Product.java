package bryzhatov.projects.shop.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-02
 */
@Data
@Table
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 35)
    private String name;
}

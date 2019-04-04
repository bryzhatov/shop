package bryzhatov.projects.shop.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

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
    @Column(name = "description_small", length = 300)
    private String descriptionSmall;
    @Column(name = "description_full" , length = 1000)
    private String descriptionFull;
    private BigDecimal price;
}

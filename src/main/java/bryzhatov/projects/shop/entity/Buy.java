package bryzhatov.projects.shop.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-04
 */
@Data
@Table
@Entity
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private long time;
    private BigDecimal allPrice;
    @ElementCollection(targetClass = Product.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "buy_product", joinColumns = @JoinColumn(name = "buy_id"))
    private List<Product> products;
}

package bryzhatov.projects.shop.entity;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-03
 */
public enum Role implements GrantedAuthority {
    USER;

    @Override
    public String getAuthority() {
        return name();
    }
}

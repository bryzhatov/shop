package unit;

import bryzhatov.projects.shop.controller.rest.UserController;
import bryzhatov.projects.shop.entity.User;
import bryzhatov.projects.shop.service.UserService;
import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-09
 */
@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
    @Mock
    private UserService userService;
    @InjectMocks
    private UserController userController;

    @Test
    public void testUser() {
        when(userService.get(1L)).thenReturn(new User());
        userController.get(1L);
        verify(userService).get(1L);
    }
}

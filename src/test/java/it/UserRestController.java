package it;

import bryzhatov.projects.shop.Application;
import bryzhatov.projects.shop.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Dmitry Bryzhatov
 * @since 2019-04-09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class UserRestController {
    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void test(){
        User user = restTemplate.exchange("", HttpMethod.GET, null, User.class).getBody();
    }
}

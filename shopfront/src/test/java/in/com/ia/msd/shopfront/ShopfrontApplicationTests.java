package in.com.ia.msd.shopfront;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import in.com.ia.msd.shopfront.ShopfrontApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = ShopfrontApplication.class)
public class ShopfrontApplicationTests {

    @Test
    public void contextLoads() {
    }

}

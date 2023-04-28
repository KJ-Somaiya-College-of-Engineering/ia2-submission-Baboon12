package in.com.ia.msd.stockmanager;

import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.com.ia.msd.stockmanager.StockManagerApplication;

// import ia.com.msd.shopping.stockmanager.StockManagerApplication;

// import msd.com.bhavya.djshopping.stockmanager.StockManagerApplication;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = StockManagerApplication.class)
class ShopfrontApplicationTests {

    @Test
    void contextLoads() {
    }
}

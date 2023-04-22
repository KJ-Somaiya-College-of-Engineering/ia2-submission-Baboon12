package msd.com.manav.djshopping.shopfront.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import msd.com.manav.djshopping.shopfront.model.Product;
import msd.com.manav.djshopping.shopfront.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @RequestMapping()
    public List<Product> getProducts() {
        return productService.getProducts();
    }
}

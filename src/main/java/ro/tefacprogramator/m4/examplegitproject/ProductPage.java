package ro.tefacprogramator.m4.examplegitproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductPage {
    
    @GetMapping("/product")
    public String product() {
        return "Product details";
    }

    @GetMapping("/product/reviews")
    public String productReviews() {
        return "Product reviews";
    }
}

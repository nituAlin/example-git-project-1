package ro.tefacprogramator.m4.examplegitproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderHistory {
    
    @GetMapping("/")
    public String orderHistory() {
        return "Order history";
    }
}

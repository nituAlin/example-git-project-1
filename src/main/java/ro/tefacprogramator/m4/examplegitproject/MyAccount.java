package ro.tefacprogramator.m4.examplegitproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAccount {
    @GetMapping("/my-account")
    public String myAccount() {
        return "My account";
    }
}

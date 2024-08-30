package com.NeedMoreCat.kitties.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/login")
    public String login() {
        return "";
    }
}

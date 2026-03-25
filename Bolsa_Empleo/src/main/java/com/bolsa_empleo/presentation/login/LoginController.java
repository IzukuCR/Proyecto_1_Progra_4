package com.bolsa_empleo.presentation.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "presentation/login/login";
    }
}

package com.grit.SpringBootLecture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRoute {

    @GetMapping("/")
    public String welcome() {
        return "Welcome Spring Boot";
    }

    @GetMapping("/two")
    public String welcome2() {
        return "Welcome Spring Boot 2";
    }

}

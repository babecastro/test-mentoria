package me.test.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @RequestMapping("/home")
    public String index() {
        return "Congratulations from BlogController.java";
    }
}

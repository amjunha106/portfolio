package com.web.portfolio.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // http://localhost:8080/index
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    // http://localhost:8080/AboutMe
    @GetMapping("/AboutMe")
    public String AboutMe(){
        return "AboutMe";
    }

    // http://localhost:8080/Portfolio
    @GetMapping("/Portfolio")
    public String Portfolio(){
        return "Portfolio";
    }

    // http://localhost:8080/Contact
    @GetMapping("/Contact")
    public String Contact(){
        return "Contact";
    }

}
